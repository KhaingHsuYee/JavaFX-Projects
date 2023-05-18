package Exercises15;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;

public class Exercise15_11 extends Application {
   @Override
   public void start(Stage primaryStage){
      BallPane ballPane = new BallPane();
      ballPane.setOnKeyPressed(e->{
         switch(e.getCode()){
            case UP:ballPane.setUp();break;
            case DOWN:ballPane.setDown();break;
            case LEFT:ballPane.setLeft();break;
            case RIGHT:ballPane.setRight();break;
         }
      });
      Scene scene = new Scene(ballPane,200,200);
      primaryStage.setTitle("Exercise15_11");
      primaryStage.setScene(scene);
      primaryStage.show();

      ballPane.requestFocus();
   }
   public static void main(String[] args){
      launch(args);
   }
   
   
}
