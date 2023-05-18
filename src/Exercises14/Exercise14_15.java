package Exercises14;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import javafx.scene.text.*;
public class Exercise14_15 extends Application{
   @Override
   public void start(Stage primaryStage){
      StackPane pane=new StackPane();
      Polygon polygon=new Polygon();
      pane.getChildren().add(polygon);
      polygon.setFill(Color.WHITE);
      polygon.setStroke(Color.BLACK);
      ObservableList<Double> list=polygon.getPoints();

      final double WIDTH=200, HEIGHT=200;
      double centerX=WIDTH/2,centerY=HEIGHT/2;
      double radius=Math.min(WIDTH, HEIGHT)*0.4;

      for(int i=0;i<4;i++){
         double x=centerX + radius * Math.cos(2 * i * Math.PI / 6);
         list.add(x);
        
         double y=centerY - radius * Math.sin(2 * i * Math.PI / 6);
         list.add(y);
         
      }
      double length=Math.sqrt(Math.pow((list.get(2)-list.get(0)), 2)+
                    Math.pow((list.get(1)-list.get(0)) ,2) );
      double x1=list.get(list.size()-2);
      double y1=list.get(list.size()-1);
     
      list.add(x1);
      list.add(y1+length);
      for(int i=4;i<6;i++){
         double x=centerX + radius * Math.cos(2 * i * Math.PI / 6);
         list.add(x);
         double y=centerY - radius * Math.sin(2 * i * Math.PI / 6);
         list.add(y+length);
         
      }
      list.add(list.get(0));
      list.add(list.get(1)+length);
      polygon.setFill(Color.RED);

      Text text=new Text("STOP");
      text.setFont(Font.font("Times New Roman",FontWeight.BOLD,50));
      text.setFill(Color.WHITE);
      pane.getChildren().add(text);

      Scene scene=new Scene(pane,WIDTH+100,HEIGHT+100);
      primaryStage.setTitle("ShowPolygon");
      primaryStage.setScene(scene);
      primaryStage.show();

   }
   public static void main(String[] args){
      Application.launch(args);
   }
   
}
