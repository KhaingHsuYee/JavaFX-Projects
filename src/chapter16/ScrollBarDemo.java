package chapter16;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.geometry.Orientation;
public class ScrollBarDemo extends Application{

   @Override
   public void start(Stage primaryStage) throws Exception {
      // TODO Auto-generated method stub
      Text text = new Text(20,20,"JavaFX Programming");
      
      ScrollBar sbHorizontal = new ScrollBar();
      // sbHorizontal.setVisibleAmount(30);
      ScrollBar sbVertical = new ScrollBar();
      sbVertical.setOrientation(Orientation.VERTICAL);

      Pane paneForText = new Pane();
      paneForText.getChildren().add(text);

      BorderPane pane = new BorderPane();
      

      pane.setCenter(paneForText);
      pane.setBottom(sbHorizontal);
      pane.setRight(sbVertical);
      sbHorizontal.valueProperty().addListener(ov->
         text.setX(sbHorizontal.getValue()*paneForText.getWidth()/sbHorizontal.getMax())
      );
      sbVertical.valueProperty().addListener(ov->
         text.setY(sbVertical.getValue()*paneForText.getHeight()/sbVertical.getMax())

      );
      Scene scene = new Scene(pane,450,170);
      primaryStage.setTitle("CheckBoxDemo");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   public static void main(String[] args) {
      launch(args);
   }
   
}
