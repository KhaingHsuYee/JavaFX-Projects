package Exercises15;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
public class Exercise15_06 extends Application{
   @Override
   public void start(Stage primaryStage){
      StackPane pane = new StackPane();
      Text text = new Text(100, 100, "Java is fun");
      text.setFont(new Font("Times New Roman",30));
      pane.getChildren().add(text);

      text.setOnMouseClicked(e->{
         if(text.getText()=="Java is fun"){
            text.setText("Java is powerful");
         }
         else{
            text.setText("Java is fun");
         }
      });
      Scene scene =new Scene(pane,300,100);
      primaryStage.setTitle("Exercise15_06");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   public static void main(String[] args){
      launch(args);
   }
   
}
