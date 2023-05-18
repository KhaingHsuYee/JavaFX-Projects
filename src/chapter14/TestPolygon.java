package chapter14;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.collections.ObservableList;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
public class TestPolygon extends Application{
   @Override
   public void start(Stage primarStage){
      Pane pane=new Pane();
      Polygon polygon=new Polygon();
      pane.getChildren().add(polygon);
      polygon.setFill(Color.WHITE);
      polygon.setStroke(Color.BLACK);
      ObservableList<Double> list=polygon.getPoints();

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

      Scene scene=new Scene(pane,200,200);
      primarStage.setTitle("TestPolygon");
      primarStage.setScene(scene);
      primarStage.show();
   }
   public static void main(String[] args){
      Application.launch(args);
   }
}
