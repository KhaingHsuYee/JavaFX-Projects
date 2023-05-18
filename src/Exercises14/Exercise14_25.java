package Exercises14;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.collections.ObservableList;
import java.util.ArrayList;
import javafx.scene.paint.Color;
public class Exercise14_25 extends Application{

   @Override
   public void start(Stage primaryStage){
      // TODO Auto-generated method stub
     

      Pane pane = new Pane();
      Circle circle = new Circle(60,60,40);
      circle.setFill(Color.WHITE);
      circle.setStroke(Color.BLACK);
      pane.getChildren().add(circle);
      ArrayList<Double> angles =new ArrayList<>();
      for(int i=0;angles.size()<5;i++){
         double angle = Math.random()*(2*Math.PI);
         
         if(!angles.contains(angle)){
            angles.add(angle);
         }
      }
      java.util.Collections.sort(angles);
      Polygon polygon = new Polygon();
      polygon.setFill(Color.WHITE);
      polygon.setStroke(Color.BLACK);
      pane.getChildren().add(polygon);
      ObservableList<Double> list = polygon.getPoints();
      for(int i=0;i<angles.size();i++){
         double x= circle.getCenterX() + circle.getRadius() * Math.cos(angles.get(i));
         double y= circle.getCenterY() - circle.getRadius() * Math.sin(angles.get(i));
         list.addAll(x,y);
      }
      Scene scene = new Scene(pane,150,150);
		primaryStage.setTitle("Exercise_14_25"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
   public static void main(String[] args){
      launch(args);
   }
   
}
