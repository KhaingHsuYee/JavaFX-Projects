package practice15;


import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.animation.PathTransition.OrientationType;
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.util.Duration;
import javafx.scene.paint.Color;

public class PathTransitionDemo extends Application{
   @Override
   public void start(Stage primaryStage){
      Rectangle rectangle = new Rectangle(0, 0, 25, 50);
      rectangle.setFill(Color.ORANGE);

      Circle circle = new Circle(125,100,50);
      circle.setStroke(Color.BLACK);
      circle.setFill(Color.WHITE);
      
      Pane pane = new Pane();
      pane.getChildren().addAll(circle,rectangle);

      PathTransition pt = new PathTransition();
      pt.setDuration(Duration.millis(4000));
      pt.setPath(circle);
      pt.setNode(rectangle);
      pt.setAutoReverse(true);
      pt.setCycleCount(Timeline.INDEFINITE);
      pt.setOrientation(OrientationType.ORTHOGONAL_TO_TANGENT);
      pt.play();

      circle.setOnMousePressed(e-> pt.pause());
      circle.setOnMouseReleased(e-> pt.play());

      Scene scene = new Scene(pane,250,200);
      primaryStage.setTitle("PathTransition");
      primaryStage.setScene(scene);
      primaryStage.show();
      
   }
   public static void main(String[] args){
      Application.launch(args);
   }
   
}
