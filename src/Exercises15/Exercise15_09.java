package Exercises15;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.collections.ObservableList;

public class Exercise15_09 extends Application{

   @Override
   public void start(Stage primaryStage){
      // TODO Auto-generated method stub

      Pane pane = new Pane();
      Polyline polyline = new Polyline(new Double(100.0),new Double(100.0));
      polyline.setFill(Color.WHITE);
      polyline.setStroke(Color.BLACK);
      pane.getChildren().add(polyline);
      ObservableList<Double> list = polyline.getPoints();
      pane.setOnKeyPressed(e->{
         double x=0,y=0;
            double length=10;
         switch(e.getCode()){
            
            case UP:x=list.get(list.size()-2);
                     y=list.get(list.size()-1)-length;
                     break;
            case DOWN:x=list.get(list.size()-2);
                     y=list.get(list.size()-1)+length;break;
            case LEFT:x=list.get(list.size()-2)-length;
                     y=list.get(list.size()-1);break;
            case RIGHT:x=list.get(list.size()-2)+length;
                        y=list.get(list.size()-1);break;
         }
         list.add(x);
         list.add(y);
      });
      Scene scene=new Scene(pane,300,200);
      primaryStage.setTitle("Exercise15_09");
      primaryStage.setScene(scene);
      primaryStage.show();
      pane.requestFocus();
      
   }
   public static void main(String[] args){
      launch(args);
   }
   
   
}

