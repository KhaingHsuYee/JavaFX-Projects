package Exercises14;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
public class Execise14_16 extends Application{
   @Override
   public void start(Stage primaryStage){
      Scene scene = new Scene(new GridPane(),200,200);
      primaryStage.setScene(scene);
      primaryStage.setTitle("Exercise14_16");
      primaryStage.show();

   }
   public static void main(String[] args){
      Application.launch(args);
   }
}
class GridPane extends Pane{
   public GridPane(){
      Line line1=new Line(0,200/3,200,200/3);
      line1.startYProperty().bind(heightProperty().divide(3));
      line1.endXProperty().bind(widthProperty());
      line1.endYProperty().bind(heightProperty().divide(3));
      line1.setStroke(Color.BLUE);
      

      Line line2= new Line();
      line2.startYProperty().bind(line1.startYProperty().multiply(2));
      line2.endXProperty().bind(widthProperty());
      line2.endYProperty().bind(line1.endYProperty().multiply(2));
      line2.setStroke(Color.BLUE);

      Line line3=new Line(200/3,0,200/3,200);
      line3.startXProperty().bind(widthProperty().divide(3));
      line3.endXProperty().bind(widthProperty().divide(3));
      line3.endYProperty().bind(heightProperty());
      line3.setStroke(Color.RED);

      Line line4=new Line();
      line4.startXProperty().bind(line3.startXProperty().multiply(2));
      line4.endXProperty().bind(line3.endXProperty().multiply(2));
      line4.endYProperty().bind(heightProperty());
      line4.setStroke(Color.RED);
      getChildren().addAll(line1,line2,line3,line4);
   }
}
