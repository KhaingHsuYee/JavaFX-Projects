package Exercises14;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.shape.Polyline;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
public class Exercise14_18 extends Application{

   @Override
   public void start(Stage primaryStage){
      Pane pane = new Pane();
      pane.setPadding(new Insets(10, 10, 10, 10));
      Polyline polyline = new Polyline();
      pane.getChildren().add(polyline);
      ObservableList<Double> list = polyline.getPoints();
      double scaleFactor = 0.0125;
      
      for(int x= -100;x<=100;x++){
         list.add(x+200.0);
         list.add(scaleFactor * x *x);
         
         
      }
      polyline.setRotate(180);
      double middlePoint=scaleFactor*(-100)*(-100);
      Line lineX = new Line(10,middlePoint,400,middlePoint);
      Line lineY = new Line(lineX.getEndX()/2,0,lineX.getEndX()/2,middlePoint+40);
      pane.getChildren().addAll(lineX,lineY);


      Polyline polyline2 = new Polyline();
      ObservableList<Double> list1 = polyline2.getPoints();
      list1.addAll(lineY.getStartX(),lineY.getStartY(),
      lineY.getStartX()-10,lineY.getStartY()+10,lineY.getStartX(),lineY.getStartY(),
      lineY.getStartX()+10,lineY.getStartY()+10);

      Polyline polyline3 = new Polyline();
      ObservableList<Double> list2 = polyline3.getPoints();
      list2.addAll(lineX.getEndX(),lineX.getEndY(),
      lineX.getEndX()-10,lineX.getEndY()-10,lineX.getEndX(),lineX.getEndY(),
      lineX.getEndX()-10,lineX.getEndY()+10);
      pane.getChildren().addAll(polyline2,polyline3);

      Text tY= new Text(lineY.getStartX()+20,lineY.getStartY()+10,"Y");
      Text tX= new Text(lineX.getEndX()-10,lineX.getEndY()-20,"X");

      pane.getChildren().addAll(tX,tY);
     
      Scene scene=new Scene(pane);
      primaryStage.setTitle("Exercise14_18");
      primaryStage.setScene(scene);
      primaryStage.show();

   }
   public static void main(String[] args){
      Application.launch(args);
   }
   
   
}
