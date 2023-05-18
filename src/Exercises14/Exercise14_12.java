package Exercises14;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
public class Exercise14_12 extends Application{

   @Override
   public void start(Stage primaryStage) {
      // TODO Auto-generated method stub

      Pane pane = new Pane();
      pane.setPadding(new Insets(10, 10, 10, 10));
      Rectangle r1 = new Rectangle(10,150+(100-50),100,50);
      r1.setFill(Color.RED);
      Text t1 = new Text(r1.getX(),r1.getY()-10,"Project -- 20%");
      t1.setFont(new Font(15));

      Rectangle r2 = new Rectangle(r1.getX()+r1.getWidth()+10,150+(100-25),100,25);
      r2.setFill(Color.BLUE);
      Text t2 = new Text(r2.getX(),r2.getY()-10,"Quiz -- 10%");
      t2.setFont(new Font(15));

      Rectangle r3 = new Rectangle(r2.getX()+r2.getWidth()+10,150+(100-75),100,75);
      r3.setFill(Color.GREEN);
      Text t3 = new Text(r3.getX(),r3.getY()-10,"Midterm -- 30%");
      t3.setFont(new Font(15));

      Rectangle r4 = new Rectangle(r3.getX()+r3.getWidth()+10,150,100,100);
      r4.setFill(Color.ORANGE);
      Text t4 = new Text(r4.getX(),r4.getY()-10,"Final -- 40%");
      t4.setFont(new Font(15));

      pane.getChildren().addAll(r1,r2,r3,r4);
      pane.getChildren().addAll(t1,t2,t3,t4);


      Scene scene = new Scene(pane);
      primaryStage.setTitle("Exercise14_12");
      primaryStage.setScene(scene);
      primaryStage.show();

   
      
   }

   public static void main(String[] args){
      Application.launch(args);
   } 
   
}
