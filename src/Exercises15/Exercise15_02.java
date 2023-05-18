package Exercises15;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;
import javafx.scene.layout.StackPane;
public class Exercise15_02 extends Application{
   @Override
   public void start(Stage primaryStage){
      
      Rectangle rectangle = new Rectangle(10,10,100,35);
      rectangle.setFill(Color.WHITE);
      rectangle.setStroke(Color.BLACK);
      
     
      Button btRotate = new Button("Rotate");
      BorderPane pane = new BorderPane();
      pane.setCenter(rectangle);
      pane.setBottom(btRotate);
      pane.setAlignment(rectangle, Pos.CENTER);
      pane.setAlignment(btRotate, Pos.TOP_CENTER);

      btRotate.setOnAction(e->{
         rectangle.setRotate(rectangle.getRotate()+15);
      });
      Scene scene = new Scene(pane,250,250);
      primaryStage.setTitle("Exercise15_02");
      primaryStage.setScene(scene);
      primaryStage.show();
      
   }
   public static void main(String[] args){
      Application.launch(args);
   }
   
}
