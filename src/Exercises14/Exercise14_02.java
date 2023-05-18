package Exercises14;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise14_02 extends Application{
   @Override
   public void start(Stage primarStage){
      GridPane pane = new GridPane();
      // Image[] imgs={new Image(""),new Image("image/o.gif"),new Image("image/x.gif")}
     
       for(int i=0;i<3;i++){
         for(int j=0;j<3;j++){
           
            int random=(int)(Math.random()*3);
            
            if(random==0){
               pane.add(new ImageView("image/o.gif"),j,i);
            }
            else if(random==1){
               pane.add(new ImageView("image/x.gif"),j,i);
            }
            else{
               continue;
            }
         }
       }
      
      //pane.add(imgs[random],0,0);
      Scene scene=new Scene(pane);
      primarStage.setTitle("Exercise14_02");
      primarStage.setScene(scene);
      primarStage.show();
   }
   public static void main(String[] args){
      Application.launch(args);
   }

   
}
