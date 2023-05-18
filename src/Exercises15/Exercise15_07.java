package Exercises15;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
public class Exercise15_07 extends Application{
   @Override
   public void start(Stage primaryStage){
      Circle circle = new Circle(100,100,50);
      circle.setStroke(Color.BLACK);
      circle.setFill(Color.WHITE);

      circle.setOnMousePressed(e->circle.setFill(Color.BLACK));
      circle.setOnMouseReleased(e->circle.setFill(Color.WHITE));
      StackPane stackPane = new StackPane(circle);
      Scene scene = new Scene(stackPane,200,200);
      primaryStage.setTitle("Exercise15_07");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   public static void main(String[] args){
      launch(args);
   }
   
}
