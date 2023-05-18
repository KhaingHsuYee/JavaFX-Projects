package Exercises14;
import chapter14.ClockPane;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
public class Exercise14_26 extends Application{
   @Override
   public void start(Stage primaryStage){
      ClockPane clock1 = new ClockPane(4, 20, 45);
      String timeString1 = clock1.getHour()+":"+clock1.getMinute()+":"+clock1.getSecond();
     
      ClockPane clock2 = new ClockPane(22, 46, 15);
      String timeString2 = clock2.getHour()+":"+clock2.getMinute()+":"+clock2.getSecond();

      Label lblTime1 = new Label(timeString1);
      Label lblTime2 = new Label(timeString2);
      BorderPane pane1 = new BorderPane();
      pane1.setCenter(clock1);
      pane1.setBottom(lblTime1);
      pane1.setAlignment(lblTime1, Pos.TOP_CENTER);
      BorderPane pane2 = new BorderPane();
      pane2.setCenter(clock2);
      pane2.setBottom(lblTime2);
      pane2.setAlignment(lblTime2, Pos.TOP_CENTER);
      HBox pane = new HBox(20);
      pane.getChildren().addAll(pane1,pane2);

      Scene scene = new Scene(pane);
      primaryStage.setScene(scene);
      primaryStage.setTitle("Exercise14_26");
      primaryStage.show();
      }
      public static void main(String[] args){
         Application.launch(args);
      }
   
}
