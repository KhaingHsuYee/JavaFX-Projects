package practice15;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
public class MouseEventDemo extends Application{
   @Override
   public void start(Stage primaryStage){
      Pane pane = new Pane();
      Text text = new Text(20,20,"Programmin is fun");
      pane.getChildren().addAll(text); 
      text.setOnMouseDragged(e->{
         text.setX(e.getX());
         text.setY(e.getY());
      });

      Scene scene = new Scene(pane,300,100);
      primaryStage.setScene(scene);
      primaryStage.setTitle("MouseEventDemo");
      primaryStage.show();
   }
   public static void main(String[] args){
      Application.launch(args);
   }
}
