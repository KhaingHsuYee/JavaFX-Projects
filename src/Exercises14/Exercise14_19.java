package Exercises14;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
public class Exercise14_19 extends Application{

   @Override
   public void start(Stage primaryStage){
      // TODO Auto-generated method stub
      Polyline polyline = new Polyline();
      ObservableList<Double> list = polyline.getPoints();
      double scaleFactor =50;
      for(int x=-170;x <= 170;x++){
         list.add(x+200.0);
         list.add(100 - 50 * Math.cos((x / 100.0) * 2 * Math.PI));
      }
      Polyline polyline2 = new Polyline();
      ObservableList<Double> list2 = polyline2.getPoints();
      
      for(int x=-170;x <= 170;x++){
         list2.add(x+200.0);
         list2.add(100 - 50 * Math.sin((x / 100.0) * 2 * Math.PI));
      }
      Pane pane=new Pane();
      pane.getChildren().addAll(polyline,polyline2);
      Scene scene=new Scene(pane);
      primaryStage.setTitle("Exercise14_19");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   public static void main(String[] args){
      Application.launch(args);
   }
   
}
