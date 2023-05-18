package chapter15;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.util.Duration;
import chapter14.ClockPane;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
public class ClockAnimation extends Application{

   @Override
   public void start(Stage primarStage){
      ClockPane clock=new ClockPane();
      EventHandler<ActionEvent> eventHandler= e->{
         clock.setCurrentTime();
      };
      Timeline animation=new Timeline(
         new KeyFrame(Duration.millis(1000), eventHandler)
      );
      animation.setCycleCount(Timeline.INDEFINITE);
      animation.play();

      Scene scene=new Scene(clock,250,250);
      primarStage.setTitle("ClockAnimation");
      primarStage.setScene(scene);
      primarStage.show();
   }
   public static void main(String[] args){
      launch(args);
   }
   
}
