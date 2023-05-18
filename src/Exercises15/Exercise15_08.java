package Exercises15;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
public class Exercise15_08 extends Application{
   Text text;
   @Override
   public void start(Stage primaryStage){
      Pane pane = new Pane();
      
      pane.setOnMouseClicked(e->{
         double x=e.getX();
         double y=e.getY();
         text = new Text(x,y,"("+x+","+y+")");
         pane.getChildren().clear();
         pane.getChildren().add(text);

      });
      
      Scene scene = new Scene(pane,400,100);
      primaryStage.setTitle("Exercise15_09");
      primaryStage.setScene(scene);
      primaryStage.show();
      
   }
   public static void main(String[] args){
      launch(args);
   }
   
}
