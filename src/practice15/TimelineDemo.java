package practice15;


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
public class TimelineDemo extends Application{
   @Override
   public void start(Stage primarStage){
      StackPane pane = new StackPane();
      Text text = new Text(20,50,"Programming is fun");
      text.setFill(Color.ORANGE);
      pane.getChildren().add(text);
      EventHandler<ActionEvent> handler =e->{
         if(text.getText().length() != 0){
            text.setText("");
         }
         else{
            text.setText("Programming is fun");
         }
      };

      Timeline animation = new Timeline(new KeyFrame(Duration.millis(500), handler));
      animation.setCycleCount(Timeline.INDEFINITE);
      animation.setAutoReverse(true);
      animation.play();

      text.setOnMouseClicked(e->{
         if(animation.getStatus() == Animation.Status.PAUSED){
            animation.play();
         }
         else{
            animation.pause();
         }
      });

      Scene scene = new Scene(pane,200,150);
      primarStage.setTitle("TimelineDemo");
      primarStage.setScene(scene);
      primarStage.show();
   }
   public static void main(String[] args){
      Application.launch(args);
   }
}
