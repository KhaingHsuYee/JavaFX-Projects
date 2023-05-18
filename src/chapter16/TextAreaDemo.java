package chapter16;


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
public class TextAreaDemo extends Application{
   
   @Override
   public void start(Stage primaryStage){
      DescriptionPane descriptionPane=new DescriptionPane();

      descriptionPane.setTitle("Canada");
      String description="The Canada national Flag........";
      descriptionPane.setDescription(description);
      descriptionPane.setImageview(new ImageView("image/ca.gif"));
      
      Scene scene=new Scene(descriptionPane,450,200);
      primaryStage.setTitle("TextAreaDemo");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   public static void main(String[] args){
      launch(args);
   }
}
