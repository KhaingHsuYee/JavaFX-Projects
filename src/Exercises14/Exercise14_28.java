package Exercises14;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.geometry.Pos;
public class Exercise14_28 extends Application{
   @Override
   public void start(Stage primaryStage){
      int hour = (int)(Math.random()*12);
      int minute = (int)(Math.random()*2)==0?0:30;
      
      ClockPane1 clock=new ClockPane1();
      clock.setHour(hour);
      clock.setMinute(minute);
      clock.setHourHandVisible(true);
      clock.setMinuteHandVisible(true);
      String timeString=clock.getHour()+":"+clock.getMinute()+":"+clock.getSecond();
      Label lblCurrentTime= new Label(timeString);

      BorderPane pane =new BorderPane();
      pane.setCenter(clock);
      pane.setBottom(lblCurrentTime);
      BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);
      Scene scene=new Scene(pane,250,250);
      primaryStage.setTitle("RandomTimes");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   public static void main(String[] args){
      Application.launch(args);
   }
   
}
