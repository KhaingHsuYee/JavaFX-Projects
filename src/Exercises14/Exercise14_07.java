package Exercises14;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;

public class Exercise14_07 extends Application{

   @Override
   public void start(Stage primaryStage){
      GridPane pane=new GridPane();
      for(int i=0;i<10;i++){
         for(int j=0;j<10;j++){
            int n=(int)(Math.random()*2);
            TextField tf=new TextField();
            tf.setPrefColumnCount(1);
            tf.setText(n+"");
            pane.add(tf, j, i);
         }
      }
      Scene scene=new Scene(pane);
      primaryStage.setTitle("Exercise14_07");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   public static void main(String[] args){
      launch(args);
   }
   
}
