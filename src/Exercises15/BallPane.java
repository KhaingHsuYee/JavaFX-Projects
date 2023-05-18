package Exercises15;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
public class BallPane extends Pane{
   Circle circle = new Circle(100,100,50);

   public BallPane(){
      
      circle.setFill(Color.WHITE);
      circle.setStroke(Color.BLACK);
      getChildren().add(circle);
   }
   public void setLeft(){
     circle.setCenterX(circle.getCenterX()-circle.getRadius()>=10?circle.getCenterX()-10:circle.getCenterX()); 

   }
   public void setRight(){
      circle.setCenterX(circle.getCenterX()+circle.getRadius()<=getWidth()-10?circle.getCenterX()+10:circle.getCenterX());
   }
   public void setUp(){
      circle.setCenterY(circle.getCenterY()-circle.getRadius()>=10?circle.getCenterY()-10:circle.getCenterY());
      }
   public void setDown(){
      circle.setCenterY(circle.getCenterY()+circle.getRadius()<=getHeight()-10?circle.getCenterY()+10:circle.getCenterY());
   }
   
}
