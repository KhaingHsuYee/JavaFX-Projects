package Exercises14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.layout.*;
public class Exercise14_05 extends Application {
   @Override
   public void start(Stage primaryStage){
     
      
      StackPane pane2=new StackPane();
     pane2.setPadding(new Insets(500,500, 500, 500));
      // Text t2=new Text(100, 100, "E");
      // t2.setFont(Font.font("Times New Roman",FontWeight.BOLD,16));
      // pane1.getChildren().add(t2);
      // pane1.setRotate(30);
      // pane2.getChildren().addAll(pane,pane1);
      // Text t3=new Text(100, 100, "L");
      // t3.setFont(Font.font("Times New Roman",FontWeight.BOLD,16));
      // t3.setRotate(-60);
      String[] text={"W","E","L","C","O","M","E"," ","T"};
      for(int i=0;i<2;i++){
         Pane pane=new Pane();
         Text t1=new Text(100, 100, text[i]);
         t1.setFont(Font.font("Times New Roman",FontWeight.BOLD,16));
         pane.getChildren().add(t1);
         pane.setRotate(90+(-8)*i);
         pane2.getChildren().addAll(pane);

      }
      
      // pane.getChildren().add(t3);
      // Text t2=new Text(100, 100, "W");
      // t2.setFont(Font.font("Times New Roman",FontWeight.BOLD,16));
      // t2.setRotate(90);
      // pane2.getChildren().add(t2);
      // pane2.setRotate(90);
      Scene scene=new Scene(pane2,500,500);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   public static void main(String[] args){
      launch(args);
   }
}
