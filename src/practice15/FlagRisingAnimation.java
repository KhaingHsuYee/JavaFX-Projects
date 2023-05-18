package practice15;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.util.Duration;
import javafx.scene.image.ImageView;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
public class FlagRisingAnimation extends Application{
   @Override
   public void start(Stage primarStage){
      Pane pane = new Pane();

      ImageView imageView = new ImageView("image/us.gif");
      pane.getChildren().add(imageView);

      PathTransition pt = new PathTransition(Duration.millis(10000), new Line(100,200,100,0), imageView);
      pt.setCycleCount(Timeline.INDEFINITE);
      pt.setAutoReverse(true);
      pt.play();

      Scene scene = new Scene (pane,250,200);
      primarStage.setTitle("FlagRisingAnimation");
      primarStage.setScene(scene);
      primarStage.show();
   }
   public static void main(String[] args){
      Application.launch(args);
   }
   
}
