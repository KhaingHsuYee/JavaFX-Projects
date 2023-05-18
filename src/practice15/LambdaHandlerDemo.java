package practice15;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
public class LambdaHandlerDemo extends Application{

   @Override
   public void start(Stage primaryStage){
      // TODO Auto-generated method stub
      HBox hBox = new HBox();
      hBox.setAlignment(Pos.CENTER);
      hBox.setSpacing(10);
      Button btNew = new Button("New");
      Button btOpen = new Button("Open");
      Button btSave = new Button("Save");
      Button btPrint = new Button("Print");
      hBox.getChildren().addAll(btNew,btOpen,btSave,btPrint);

      btNew.setOnAction((ActionEvent e)->{
         System.out.println("Process New");
      });

      btOpen.setOnAction(e->{
         System.out.println("Process Open");
      });

      btSave.setOnAction(e->{
         System.out.println("Process Save");
      });

      btPrint.setOnAction(e->{
         System.out.println("Process Print");
      });

      Scene scene = new Scene(hBox,300,50);
      primaryStage.setScene(scene);
      primaryStage.setTitle("LambdaHandlerDemo");
      primaryStage.show();
   }
   public static void main(String[] args){
      launch(args);
   }
   
}
