package chapter14;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.shape.Rectangle;
public class ShowRectangle extends Application{
   @Override
   public void start(Stage primarStage){
      Pane pane=new Pane();
      Rectangle r1=new Rectangle(25,10,60,30);
      r1.setStroke(Color.BLACK);
      r1.setFill(Color.WHITE);
      pane.getChildren().add(new Text(10,27,"r1"));
      pane.getChildren().add(r1);

      Rectangle r2=new Rectangle(25,50,60,30);
      pane.getChildren().add(new Text(10,67,"r2"));
      pane.getChildren().add(r2);
      
      Rectangle r3=new Rectangle(25,90,60,30);
      r3.setArcWidth(15);
      r3.setArcHeight(25);
      pane.getChildren().add(new Text(10,107,"r3"));
      pane.getChildren().add(r3);

      for(int i=0;i<4;i++){
         Rectangle r=new Rectangle(100,50,100,30);
         r.setRotate(i*360/8);
         r.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
         r.setFill(Color.WHITE);
         pane.getChildren().add(r);
      }
      Scene scene=new Scene(pane,250,150);
      primarStage.setTitle("ShowRectangle");
      primarStage.setScene(scene);
      primarStage.show();
   }

   public static void main(String[] args) {
      Application.launch(args);
   }
}
