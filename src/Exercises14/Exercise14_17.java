package Exercises14;
/**********************************************************************************
* (Game: hangman) Write a program that displays a drawing for the popular hangman *
* game, as shown in Figure 14.48a.                                                *EE
**********************************************************************************/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.layout.Pane;
import javafx.collections.ObservableList;

public class Exercise14_17 extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane
		Pane pane = new Pane();

		// Create three polylines and set their properties
		Polyline polyline1 = new Polyline();
      pane.getChildren().add(polyline1);
      ObservableList<Double> list1 = polyline1.getPoints();
      double x1=40;
      double x2=125;
      double y2=40;
      double y1=200;
      
      list1.addAll(x1,y1,x1,y2,x2,y2,x2,y1 * 0.7);

      Polyline polyline2 = new Polyline();
      pane.getChildren().add(polyline2);
      ObservableList<Double> list2 = polyline2.getPoints();

      list2.addAll(x2,y1*0.7,x2-30,y1 * 0.8,x2,y1*0.7,x2+30,y1 * 0.8);

      Polyline polyline3 = new Polyline();
      pane.getChildren().add(polyline3);
      ObservableList<Double> list3 = polyline3.getPoints();

      list3.addAll(x2,y1*0.35,x2-45,y1*0.6,x2,y1*0.35,x2+45,y1*0.6);

      Circle circle = new Circle(x2,y1*0.35,15);
      circle.setFill(Color.WHITE);
      circle.setStroke(Color.BLACK);
      pane.getChildren().add(circle);

      Arc arc = new Arc(x1,y1+10,25,10,0,180);
      arc.setFill(Color.WHITE);
      arc.setStroke(Color.BLACK);
      pane.getChildren().add(arc);

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 200, 250);
		primaryStage.setTitle("Exercise_14_17"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
   public static void main(String[] args){
      launch(args);
   }
}
