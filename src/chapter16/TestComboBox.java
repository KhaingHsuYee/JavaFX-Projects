package chapter16;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
public class TestComboBox extends Application{

   @Override
   public void start(Stage primaryStage) throws Exception {
      // TODO Auto-generated method stub
      ComboBox<String> co=new ComboBox<>();
      co.getItems().addAll("Item 1","Item 2","Item 3","Item 4");
      co.setStyle("-fx-color:red");
      co.setEditable(true);
      co.setValue("Item 1");
      co.setVisibleRowCount(2);
      Scene scene=new Scene(co);
      primaryStage.setTitle("Test");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   public static void main(String[] args){
      launch(args);
   }

   
   
}
