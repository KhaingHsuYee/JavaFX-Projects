package chapter15;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
public class LambdaHandlerDemo extends Application{
   @Override
   public void start(Stage primaryStage){
      HBox hBox=new HBox(10);
      hBox.setAlignment(Pos.CENTER);
      Button btNew=new Button("New");
      Button btOpen=new Button("Open");
      Button btSave=new Button("Save");
      Button btPrint=new Button("Print");
      hBox.getChildren().addAll(btNew,btOpen,btPrint,btSave);
      btNew.setOnAction((ActionEvent e)->{
         System.out.println("Process New");
      });
      btOpen.setOnAction(e -> {
         System.out.println("Process Open");
      });
      btSave.setOnAction(e -> {
         System.out.println("Process Save");
      });
      btPrint.setOnAction(e -> {
         System.out.println("Process Print");
      });
      Scene scene=new Scene(hBox,300,50);
      primaryStage.setTitle("LambdaHandlerDemo");
      primaryStage.setScene(scene);
      primaryStage.show();
      

   }
   public static void main(String[] args){
      Application.launch(args);
   }
   
}
