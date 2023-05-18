package chapter15;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.animation.Animation;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
public class TimelineDemo  extends Application{

   @Override
   public void start(Stage primarStage){
      StackPane pane=new StackPane();
      Text text=new Text(20,50,"Programming is fun");
      text.setFill(Color.RED);
      pane.getChildren().add(text);

      EventHandler<ActionEvent> eventHandler=e -> {
         if(text.getText().length()!=0){
            text.setText("");
         }
         else{
            text.setText("Programming is fun");
         }
      };

      Timeline animation =new Timeline(
         new KeyFrame(Duration.millis(500), eventHandler)
      );
      animation.setCycleCount(Timeline.INDEFINITE);
      animation.play();
      text.setOnMouseClicked(e->{
         if(animation.getStatus()==Animation.Status.PAUSED){
            animation.play();
         }
         else{
            animation.pause();
         }
      });
      Scene scene=new Scene(pane,250,250);
      primarStage.setTitle("TimelineDemo");
      primarStage.setScene(scene);
      primarStage.show();
   }
   public static void main(String[] args){
      launch(args);
   }
   
}
