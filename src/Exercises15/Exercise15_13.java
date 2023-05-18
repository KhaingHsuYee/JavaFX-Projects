package Exercises15;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
public class Exercise15_13 extends Application{
   Text text = new Text();
   @Override   
   public void start(Stage primaryStage){
      Rectangle rectangle = new Rectangle(100, 60, 100, 40);
      rectangle.setFill(Color.WHITE);
      rectangle.setStroke(Color.BLACK);
      Pane pane = new Pane();
      pane.getChildren().addAll(rectangle,text);
      pane.setOnMouseMoved(e->{
         if(rectangle.contains(e.getX(),e.getY())){
            text.setText("");
            text.setText("Mouse point is inside the rectangle");
            text.setX(e.getX());
            text.setY(e.getY());
         }
         else{

            
            text.setText("Mouse point is outside the rectangle");
            text.setX(e.getX());
            text.setY(e.getY());


         }
      });
      Scene scene=new Scene(pane,250,250);
      primaryStage.setTitle("Exercise15_13");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   public static void main(String[] args){
      Application.launch(args);
   }
   
}
