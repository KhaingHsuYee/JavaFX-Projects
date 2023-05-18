package Exercises14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
public class Exercise14_11 extends Application{

   @Override
   public void start(Stage primarStage){
      StackPane face=new StackPane();
      face.setPadding(new Insets(10, 10, 10, 10));
      Circle circle=new Circle(50,50,100);
      circle.setFill(Color.WHITE);
      circle.setStroke(Color.BLACK);
      face.getChildren().add(circle);
      
      Pane pane=new Pane();
      pane.getChildren().add(face);
      pane.getChildren().add(getLeftEye(circle));
      pane.getChildren().add(getRightEye());
      StackPane spane=new StackPane();
      spane.getChildren().add(pane);
      Scene scene=new Scene(spane,300,300);
      primarStage.setScene(scene);
      primarStage.show();

   }
   public StackPane getLeftEye(Circle circle){
      StackPane leftEye=new StackPane();

      Ellipse e1=new Ellipse(circle.getCenterX()/2,circle.getCenterY()/2,20,15);
      Ellipse e2=new Ellipse(100+circle.getCenterX()/2,100+circle.getCenterY()/2,20,15);
      e1.setFill(Color.WHITE);
      e1.setStroke(Color.BLACK);
      e2.setFill(Color.WHITE);
      e2.setStroke(Color.BLACK);
      Circle c1=new Circle(50,50, 10);
      Circle c2=new Circle(150,150, 10);
      leftEye.getChildren().add(e1);
      leftEye.getChildren().add(c1);
      // eyes.getChildren().add(e2);
      // eyes.getChildren().add(c2);
      return leftEye;
      

   }
   public StackPane getRightEye(){
      StackPane rightEye=new StackPane();

     
      Ellipse e2=new Ellipse(150,150,20,15);
     
      e2.setFill(Color.WHITE);
      e2.setStroke(Color.BLACK);
      
      Circle c2=new Circle(150,150, 10);
      
      rightEye.getChildren().add(e2);
      rightEye.getChildren().add(c2);
      return rightEye;
      

   }
   public static void main(String[] args){
      launch(args);
   }
}
