package practice16;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.collections.FXCollections;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.BorderPane;

public class ListViewDemo extends Application{

   private String[] flagTitles = {"Canada","China","Denmark","France","Germany","India","Norway","United Kindom","United States of America"};
   private ImageView[] imageViews = {new ImageView("image/ca.gif"),
                                    new ImageView("image/china.gif"),
                                    new ImageView("image/denmark.gif"),
                                    new ImageView("image/fr.gif"),
                                    new ImageView("image/germany.gif"),
                                    new ImageView("image/india.gif"),
                                    new ImageView("image/norway.gif"),
                                    new ImageView("image/uk.gif"),
                                    new ImageView("image/us.gif")};
   @Override
   public void start(Stage primaryStage){
      // TODO Auto-generated method stub
      ListView<String> lv = new ListView<>(FXCollections.observableArrayList(flagTitles));
      lv.setPrefSize(100, 400);
      lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

      FlowPane imagePane = new FlowPane(10,10);
      BorderPane pane = new BorderPane();
      pane.setLeft(new ScrollPane(lv));
      pane.setCenter(imagePane);

      lv.getSelectionModel().selectedItemProperty().addListener(ov->{
         imagePane.getChildren().clear();
         for(Integer i:lv.getSelectionModel().getSelectedIndices()){
            imagePane.getChildren().add(imageViews[i]);
         }
      });

      Scene scene = new Scene(pane,450,450);
      primaryStage.setTitle("ListViewDemo");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   public static void main(String[] args) {
      launch(args);
   }
   
}
