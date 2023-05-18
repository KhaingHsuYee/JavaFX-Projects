package Exercises14;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.paint.Color;
public class Exercise14_04 extends Application{

   @Override
   public void start(Stage primaryStage) throws Exception {
      // TODO Auto-generated method stub
      VBox vBox=new VBox(10);
      vBox.setAlignment(Pos.CENTER);
      for(int i=0;i<5;i++){
         int x=0;
         Text text=new Text(20+x,20,"Java");
         text.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC,22
         ));
         text.setFill(new Color(Math.random(),Math.random(),Math.random(),Math.random()));
         vBox.getChildren().add(text);
         x+=30;
      }
      
      vBox.setRotate(90);
      Scene scene=new Scene(vBox,300,150);
      primaryStage.setTitle("Exercise14_04");
      primaryStage.setScene(scene);
      primaryStage.show();
      
   }
   public static void main(String[] args){
      Application.launch(args);
   }
   
}
