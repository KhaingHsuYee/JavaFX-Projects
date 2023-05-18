package Exercises14;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Ellipse;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
public class Exercise14_10 extends Application{

   @Override
   public void start(Stage primaryStage){
      Pane pane=new Pane();
      Ellipse ellipse=new Ellipse(100,50,50,30);
      ellipse.setFill(Color.WHITE);
      ellipse.setStroke(Color.BLACK);
      Line l1=new Line(50,50,50,200);
      Line l2=new Line(150,50,150,200); 
      Arc arc1=new Arc(100,200,50,30,0,180);
      arc1.setFill(Color.WHITE);
      arc1.setStroke(Color.BLACK);
      arc1.getStrokeDashArray().addAll(6.0,21.0);
      Arc arc2=new Arc(100,200,50,30,0,-180);
      arc2.setFill(Color.WHITE);
      arc2.setStroke(Color.BLACK);
      pane.getChildren().add(ellipse);
      pane.getChildren().add(l1);
      pane.getChildren().add(l2);
      pane.getChildren().add(arc1);
      pane.getChildren().add(arc2);

      Scene scene=new Scene(pane,300,300);
      primaryStage.setTitle("Exercise14_10");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   public static void main(String[] args){
      Application.launch(args);
   }
   
}
