package Exercises14;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
public class Exercise14_21 extends Application {

   @Override
   public void start(Stage primaryStage){
      // TODO Auto-generated method stub
      Pane pane= new Pane();
      
      pane.setPadding(new Insets(10, 10, 10, 10));
      Circle c1=new Circle(10+Math.random()*100,10+Math.random()*100,15);
      Circle c2=new Circle(100+Math.random()*200,100+Math.random()*200,15);
      Line line = new Line(c1.getCenterX(),c1.getCenterY(),c2.getCenterX(),c2.getCenterY());
      double distance = Math.sqrt(Math.pow((c2.getCenterX()-c1.getCenterX()), 2)+
      Math.pow((c2.getCenterY()-c1.getCenterY()), 2));
      double x = (line.getStartX() + line.getEndX()) / 2;
		double y = (line.getStartY() + line.getEndY()) / 2;
      Text text = new Text(x,y,distance+"");
      
      
      pane.getChildren().addAll(c1,c2,line,text);
      Scene scene=new Scene(pane);
      primaryStage.setTitle("Exercise14_19");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   public static void main(String[] args){
      Application.launch(args);
   }
   
}
