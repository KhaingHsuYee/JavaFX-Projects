package Exercises14;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Circle;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import java.util.Scanner;
import javafx.collections.ObservableList;
import javafx.scene.text.Text;
public class Exercise14_24 extends Application{

   @Override
   public void start(Stage primaryStage){
      // TODO Auto-generated method stub
     Pane pane = new Pane();
     Scanner input = new Scanner(System.in);
     System.out.print("Enter the coordinates of five points:");
     String[] points = (input.nextLine()).split("[ ]");
     Polygon polygon = new Polygon();
     pane.getChildren().add(polygon);
     ObservableList<Double> list = polygon.getPoints();
     for(int i=0;i<points.length-2;i++){
      list.add(Double.parseDouble(points[i]));
     }
     polygon.setFill(Color.WHITE);
     polygon.setStroke(Color.BLACK);
     Circle circle =new Circle(Double.parseDouble(points[points.length-2]),Double.parseDouble(points[points.length-1]),10);
     pane.getChildren().add(circle);
     Text text = new Text();
     if(polygon.contains(Double.parseDouble(points[points.length-2]),Double.parseDouble(points[points.length-1]))){
         text.setText("The points is inside the polygon");
     }
     else{
      text.setText("The points is not inside the polygon");
     }
     VBox vbox = new VBox(20);
     vbox.getChildren().addAll(pane,text);

     Scene scene = new Scene(vbox, 200, 250);
		primaryStage.setTitle("Exercise_14_24"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
   public static void main(String[] args){
      launch(args);
   }
   
   
   
}
