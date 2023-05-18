package Exercises15;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
public class Exercise15_14 extends Application{
   Text text = new Text();

   @Override
   public void start(Stage primaryStage){
      // TODO Auto-generated method stub
      Pane pane = new Pane();
      Polygon polygon = new Polygon();
      pane.getChildren().addAll(polygon,text);
      polygon.setFill(Color.WHITE);
      polygon.setStroke(Color.BLACK);
      ObservableList<Double> list = polygon.getPoints();
      list.add(40.0);
      list.add(20.0);
      list.add(70.0);
      list.add(40.0);
      list.add(60.0);
      list.add(80.0);
      list.add(45.0);
      list.add(45.0);
      list.add(20.0);
      list.add(60.0);

      pane.setOnMouseMoved(e->{
         if(polygon.contains(e.getX(),e.getY())){
            text.setText("Mouse point is inside the polygon");
            text.setX(e.getX());
            text.setY(e.getY());
         }
         else{
            text.setText("Mouse point is outside the polygon");
            text.setX(e.getX());
            text.setY(e.getY());
         }
      });
      Scene scene=new Scene(pane,250,250);
      primaryStage.setTitle("Exercise15_14");
      primaryStage.setScene(scene);
      primaryStage.show();
      
   }
   public static void main(String[] args) {
      Application.launch(args);
   }
   
}
