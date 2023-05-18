package Exercises14;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
public class Exercise14_13 extends Application{

   @Override
   public void start(Stage primaryStage){
      // TODO Auto-generated method stub
     Pane pane = new Pane();
     pane.setPadding(new Insets(20, 20, 20, 20));
     Arc arc1 = new Arc(200, 200, 100, 100, 0, 3.6*20);
     arc1.setType(ArcType.ROUND);
     arc1.setFill(Color.RED);

     Arc arc2 = new Arc(200,200,100,100,arc1.getStartAngle()+arc1.getLength(),3.6*10);
     arc2.setType(ArcType.ROUND);
     arc2.setFill(Color.BLUE);

     Arc arc3 = new Arc(200,200,100,100,arc2.getStartAngle()+arc2.getLength(),3.6*30);
     arc3.setType(ArcType.ROUND);
     arc3.setFill(Color.GREEN);

     Arc arc4 = new Arc(200,200,100,100,arc3.getStartAngle()+arc3.getLength(),3.6*40);
     arc4.setType(ArcType.ROUND);
     arc4.setFill(Color.ORANGE);
     pane.getChildren().addAll(arc1,arc2,arc3,arc4);

     Text t1 = new Text(arc1.getCenterX()+30,arc1.getCenterY()-20,"Project -- 20%");
     t1.setFont(new Font(15));

     Text t2 = new Text(arc2.getCenterX()-10,arc2.getCenterY()-arc2.getRadiusY()-10,"Quiz -- 10%");
     t2.setFont(new Font(15));

     Text t3 =new Text(arc3.getCenterX()-arc3.getRadiusX()-20,arc3.getCenterY(),"Midterm -- 30%");
     t3.setFont(new Font(15));

     Text t4 = new Text(arc4.getCenterX(),arc4.getCenterY()+arc4.getRadiusY(),"Final -- 40%");
     t4.setFont(new Font(15));
     
     pane.getChildren().addAll(t1,t2,t3,t4);
     Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise_14_13"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
   public static void main(String[] args){
      launch(args);
   }
   
   
}
