package Exercises14;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
public class Exercise14_14 extends Application{
   
   @Override
   public void start(Stage primarStage){
      Pane pane =new Pane();
      Rectangle r1=new Rectangle(20,10,80,60);
      Rectangle r2=new Rectangle(10,30,80,60);
      r1.setFill(null);
      r1.setStroke(Color.BLACK);
      r2.setFill(null);
      r2.setStroke(Color.BLACK);
      pane.getChildren().add(r1);
      pane.getChildren().add(r2);
      Line l1=new Line(r1.getX(),r1.getY(),r2.getX(),r2.getY());
      Line l2=new Line(r1.getX()+r1.getWidth(),r1.getY(),r2.getX()+r2.getWidth(),r2.getY());
      Line l3=new Line(r1.getX(),r1.getY()+r1.getHeight(),r2.getX(),r2.getY()+r2.getHeight());
      Line l4=new Line(r1.getX()+r1.getWidth(),r1.getY()+r1.getHeight(),r2.getX()+r2.getWidth(),r2.getY()+r2.getHeight());
      pane.getChildren().addAll(l1,l2,l3,l4);
      Scene scene=new Scene(pane,200,200);
      primarStage.setScene(scene);
      primarStage.show();
   }
   public static void main(String[] args){
      launch(args);
   }
}
