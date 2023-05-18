package Exercises15;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
public class Exercise15_08_2 extends Application{

   Text text;

   @Override
   public void start(Stage primaryStage){
      // TODO Auto-generated method stub
      Pane pane = new Pane();
      
      pane.setOnMousePressed(e->{
         double x=e.getX();
         double y=e.getY();
         text = new Text(x,y,"("+x+","+y+")");
         
         pane.getChildren().add(text);

      });
      pane.setOnMouseReleased(e->pane.getChildren().clear());
      
      Scene scene = new Scene(pane,400,100);
      primaryStage.setTitle("Exercise15_08");
      primaryStage.setScene(scene);
      primaryStage.show();
      
   }
   public static void main(String[] args){
      launch(args);
   }
   
}
