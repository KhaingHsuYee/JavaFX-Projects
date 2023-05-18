package Exercises14;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.util.ArrayList;
public class Exercise14_08 extends Application{
  
   

   @Override
   public void start(Stage primaryStage) throws Exception {
      // TODO Auto-generated method stub
      GridPane pane=new GridPane();
      ArrayList<Image> imgList=new ArrayList<>();
      for(int i=1;i<=52;i++){
         Image img=new Image("image/card/"+i+".png");
         imgList.add(img);
         
      }
      java.util.Collections.shuffle(imgList);
      // Image[] array=new Image[imgList.size()];
      // imgList.toArray(array);
      // for(int j=0;j<8;j++){
      //    for(int k=0;k<9;k++){
      //       Image img=array[j*10+k];
      //       // Image img=imgList.get(j*10+k);
      //       pane.add(new ImageView(img),wk,j);
      //    }
      // }
      int k=0;
      for(int i=0;i<9;i++){
         for(int j=0;j<9;j++){
            pane.add(new ImageView(imgList.get(k++)),i,j);
         }
      }
     
      Scene scene=new Scene(pane,300,150);
      primaryStage.setTitle("Exercise14_03");
      primaryStage.setScene(scene);
      primaryStage.show();
      
   }
   public static void main(String[] args){
      launch(args);
   }
}
