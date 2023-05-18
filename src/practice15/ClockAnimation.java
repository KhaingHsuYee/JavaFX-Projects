package practice15;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import chapter14.ClockPane;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.util.Duration;
public class ClockAnimation extends Application{
   @Override
   public void start(Stage primaryStage){
      ClockPane clockPane = new ClockPane();

      EventHandler<ActionEvent> eventHandler = e->{
         clockPane.setCurrentTime();
      };

      Timeline animation = new Timeline(new KeyFrame(Duration.millis(1000),eventHandler));
      animation.setCycleCount(Timeline.INDEFINITE);
      animation.play();

      Scene scene = new Scene(clockPane,250,250);
      primaryStage.setTitle("ClockAnimation");
      primaryStage.setScene(scene);
      primaryStage.show();
      
   }
   public static void main(String[] args){
      Application.launch(args);
   }
   
}
