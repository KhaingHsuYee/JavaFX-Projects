package practice15;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
public class HandleEvent extends Application{
   @Override
   public void start(Stage primaryStage){
      HBox pane = new HBox(10);
      pane.setAlignment(Pos.CENTER);
      Button btOk = new Button("OK");
      Button btCancel = new Button("Cancel");
      OkHandlerClass handler1 = new OkHandlerClass();
      btOk.setOnAction(handler1);
      CancelHandlerClass handler2 = new CancelHandlerClass();
      btCancel.setOnAction(handler2);
      pane.getChildren().addAll(btOk,btCancel);
      Scene scene =new Scene(pane);
      primaryStage.setTitle("handleEvent");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   public static void main(String[] args){
      launch(args);
   }
   
}
class OkHandlerClass implements EventHandler<ActionEvent>{
   @Override
   public void handle(ActionEvent e){
      System.out.println("OK button clicked");
   }
}
class CancelHandlerClass implements EventHandler<ActionEvent>{
   @Override 
   public void handle(ActionEvent e){
     System.out.println("Cancel button clicked");
   }
}
