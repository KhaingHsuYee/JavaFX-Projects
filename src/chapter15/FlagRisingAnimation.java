package chapter15;
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FlagRisingAnimation extends Application{
   @Override
   public void start(Stage primaryStage){
      Pane pane=new Pane();
      ImageView imageView=new ImageView("image/us.gif");
      pane.getChildren().add(imageView);

      PathTransition pt=new PathTransition(Duration.millis(10000),new Line(100,200,100,0),imageView);
      pt.setCycleCount(5);
      pt.setAutoReverse(true);
      pt.play();

      Scene scene=new Scene(pane,250,200);
      primaryStage.setTitle("FlagRisingAnimation");
      primaryStage.setScene(scene);
      primaryStage.show();

   }
   public static void main(String[] args){
      Application.launch(args);
   }
   
}
