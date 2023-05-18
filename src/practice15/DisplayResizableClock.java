package practice15;
import chapter14.ClockPane;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;

public class DisplayResizableClock extends Application{
   @Override 
   public void start(Stage primaryStage){
      ClockPane clock = new ClockPane();
      String timeString = clock.getHour()+":"+clock.getMinute()+":"+clock.getSecond();
      Label lb1CurrentTime = new Label(timeString);

      BorderPane pane = new BorderPane();
      pane.setCenter(clock);
      pane.setBottom(lb1CurrentTime);
      pane.setAlignment(lb1CurrentTime, Pos.TOP_CENTER);

      Scene scene = new Scene(pane,250,250);
      primaryStage.setTitle("DisplayClock");
      primaryStage.setScene(scene);
      primaryStage.show();

      pane.widthProperty().addListener(ov->{
         clock.setW(pane.getWidth());
      });

      pane.heightProperty().addListener(ov->{
         clock.setH(pane.getHeight());
      });
   }
   public static void main(String[] args){
      Application.launch(args);
   }
   
}
