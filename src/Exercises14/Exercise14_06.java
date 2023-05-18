package Exercises14;


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
public class Exercise14_06 extends Application{
   @Override
   public void start(Stage primaryStage){
      GridPane pane=new GridPane();
      for(int i=0;i<9;i++){
         for(int j=0;j<9;j++){
            Rectangle rectangle=new Rectangle(30,30,30,30);
            if((j+i)%2==0){
               rectangle.setFill(Color.WHITE);
            }
            pane.add(rectangle, j,i);
         }
      }
      Scene scene=new Scene(pane);
      primaryStage.setTitle("Exercise14_06");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   public static void main(String[] args){
      launch(args);
   }
   
}
