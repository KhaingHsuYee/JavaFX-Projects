package practice15;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class AnonymousHandlerDemo extends Application{
   
   @Override
   public void start(Stage primaryStage){
      HBox hbox = new HBox();
      hbox.setSpacing(10);
      hbox.setAlignment(Pos.CENTER);
      Button btNew = new Button("New");
      Button btOpen = new Button("Open");
      Button btSave = new Button("Save");
      Button btPrint = new Button("Print");
      hbox.getChildren().addAll(btNew,btOpen,btSave,btPrint);

      btNew.setOnAction(new EventHandler<ActionEvent>() {
         @Override
         public void handle(ActionEvent e){
            System.out.println("Process New");
         }
      });

      btOpen.setOnAction(new EventHandler<ActionEvent>() {
         @Override
         public void handle(ActionEvent e){
            System.out.println("Process Open");
         }
      });

      btSave.setOnAction(new EventHandler<ActionEvent>(){
         @Override
         public void handle(ActionEvent e){
            System.out.println("Process Save");
         }
      });

      btPrint.setOnAction(new EventHandler<ActionEvent>(){
         @Override
         public void handle(ActionEvent e){
            System.out.println("Process Print");
         }
      });

      Scene scene = new Scene(hbox,300,50);
      primaryStage.setTitle("AnonymousHandlerDemo");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   public static void main(String[] args){
      Application.launch(args);
   }
}
