package Exercises15;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.shape.Line;
public class Exercise15_16 extends Application{
   @Override
   public void start(Stage primaryStage){
      Circle c1 = new Circle(40,40,10);
      Circle c2 = new Circle(120,150,10);
      
      Line line = new Line(c1.getCenterX(),c1.getCenterY(),
      c2.getCenterX(),c2.getCenterY());
      Pane pane = new Pane();
      pane.getChildren().addAll(line,c1,c2);
      c1.setFill(Color.WHITE);
      c1.setStroke(Color.BLACK);
      c2.setFill(Color.WHITE);
      c2.setStroke(Color.BLACK);
      Scene scene=new Scene(pane,250,250);
      primaryStage.setTitle("Exercise15_15");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   public static void main(String[] args) {
      Application.launch(args);
   }
   
}
