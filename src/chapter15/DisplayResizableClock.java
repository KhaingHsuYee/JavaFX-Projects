package chapter15;
import chapter14.ClockPane;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
public class DisplayResizableClock extends Application{
   @Override
   public void start(Stage primarStage){
      ClockPane clock=new ClockPane();
      String timeString=clock.getHour()+":"+clock.getMinute()+":"+clock.getSecond();
      Label lbCurrentTime=new Label(timeString);
      BorderPane pane=new BorderPane();
      pane.setCenter(clock);
      pane.setBottom(lbCurrentTime);
      pane.setAlignment(lbCurrentTime, Pos.TOP_CENTER);

      Scene scene=new Scene(pane,250,250);
      primarStage.setScene(scene);
      primarStage.setTitle("DisplayClock");
      primarStage.show();
      pane.widthProperty().addListener(ov->
         clock.setW(pane.getWidth())
      );
      pane.heightProperty().addListener(ov->
         clock.setH(pane.getHeight())
      );
   }
   public static void main(String[] args){
      Application.launch(args);
   }
}
