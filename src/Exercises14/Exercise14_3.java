package Exercises14;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.util.ArrayList;
public class Exercise14_3 extends Application{

   @Override
   public void start(Stage primaryStage) throws Exception {
      // TODO Auto-generated method stub
      ArrayList<Image> imgList=new ArrayList<>();
      HBox hBox=new HBox(10);
      hBox.setAlignment(Pos.CENTER);
      for(int i=1;i<=52;i++){
         Image img=new Image("image/card/"+i+".png");
         imgList.add(img);
         
      }
      java.util.Collections.shuffle(imgList);
      for(int i=0;i<3;i++){
         ImageView imgView=new ImageView(imgList.get(i));
         hBox.getChildren().add(imgView);
      }
      
      

      
      
      
      Scene scene=new Scene(hBox,300,150);
      primaryStage.setTitle("Exercise14_03");
      primaryStage.setScene(scene);
      primaryStage.show();
      
   }
   public static void main(String[] args){
      Application.launch(args);
   }
   
   
}
