package practice16;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
public class ComboBoxDemo extends Application{

   private String[] flagTitles = {"Canada","China","Denmark","France","Germany","India","Norway","United Kindom","United States of America"};

   private ImageView[] flagImage = {new ImageView("image/ca.gif"),
                                    new ImageView("image/china.gif"),
                                    new ImageView("image/denmark.gif"),
                                    new ImageView("image/fr.gif"),
                                    new ImageView("image/germany.gif"),
                                    new ImageView("image/india.gif"),
                                    new ImageView("image/norway.gif"),
                                    new ImageView("image/uk.gif"),
                                    new ImageView("image/us.gif")};

   private String[] flagDescription = new String[9];

   private DescriptionPane descriptionPane = new DescriptionPane();

   private ComboBox<String> cbo = new ComboBox<>();
   
   @Override
   public void start(Stage primaryStage){
      // TODO Auto-generated method stub

      flagDescription[0] = "The Canadian national flag ...";
      flagDescription[1] = "Description for China ...";
      flagDescription[2] = "Description for Denmark ...";
      flagDescription[3] = "Description for France ...";
      flagDescription[4] = "Description for Germany ...";
      flagDescription[5] = "Description for India ...";
      flagDescription[6] = "Description for Norway ...";
      flagDescription[7] = "Description for UK ...";
      flagDescription[8] = "Description for US ...";

      BorderPane pane = new BorderPane();

      BorderPane paneForComboBox = new BorderPane();
      paneForComboBox.setLeft(new Label("Select a country:"));
      paneForComboBox.setCenter(cbo);
      pane.setTop(paneForComboBox);
      cbo.setPrefWidth(400);
      cbo.setValue("Canada");
      ObservableList<String> items = FXCollections.observableArrayList(flagTitles);
      cbo.getItems().addAll(items);
      pane.setCenter(descriptionPane);
      setDisplay(0);
      cbo.setOnAction(e->setDisplay(items.indexOf(cbo.getValue())));
      Scene scene = new Scene(pane,450,170);
      primaryStage.setTitle("CheckBoxDemo");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   public static void main(String[] args) {
      launch(args);
   }
   public void setDisplay(int index){
      descriptionPane.setTitle(flagTitles[index]);
      descriptionPane.setImageView(flagImage[index]);
      descriptionPane.setDescription(flagDescription[index]);
   }
   
}
