package Exercises14;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Exercise14_1 extends Application{
   @Override
   public void start(Stage primarStage){
      GridPane pane=new GridPane();
      pane.setHgap(10);
      pane.setVgap(10);
      pane.setAlignment(Pos.CENTER);
      ImageView img1=new ImageView("image/uk.gif");
      ImageView img2=new ImageView("image/ca.gif");
      ImageView img3=new ImageView("image/china.gif");
      ImageView img4=new ImageView("image/us.gif");
      pane.add(img1, 0, 0);
      pane.add(img2,1,0);
      pane.add(img3,0,1);
      pane.add(img4,1,1);
      Scene scene =new Scene(pane);
      primarStage.setTitle("Exercise14_01");
      primarStage.setScene(scene);
      primarStage.show();
   }
   public static void main(String[] args){
      Application.launch(args);
   }
   
}
