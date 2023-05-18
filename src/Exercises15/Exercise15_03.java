package Exercises15;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
public class Exercise15_03 extends Application{
   

   @Override
   public void start(Stage primaryStage){
      // TODO Auto-generated method stub
      BallPane ballPane = new BallPane();
      HBox paneForButtons = new HBox(10);
      Button btLeft = new Button("Left");
      Button btRight = new Button("Right");
      Button btUp = new Button("Up");
      Button btDown = new Button("Down");

      paneForButtons.getChildren().addAll(btLeft,btRight,btUp,btDown);
      paneForButtons.setAlignment(Pos.CENTER);

      BorderPane pane = new BorderPane();
      pane.setCenter(ballPane);
      pane.setBottom(paneForButtons);

      btLeft.setOnAction(e->ballPane.setLeft());
      btRight.setOnAction(e->ballPane.setRight());
      btUp.setOnAction(e->ballPane.setUp());
      btDown.setOnAction(e->ballPane.setDown());
      
      Scene scene = new Scene(pane,300,300);
      primaryStage.setTitle("Exercise15_04");
      primaryStage.setScene(scene);
      primaryStage.show();
      
   }
   public static void main(String[] args){
      launch(args);
   }
   

   

}
