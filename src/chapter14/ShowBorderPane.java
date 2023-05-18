package chapter14;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
public class ShowBorderPane extends Application{
   @Override
   public void start (Stage primaryStage){
      BorderPane pane = new BorderPane();

      pane.setTop(new CustomPane("Top"));
      pane.setRight(new CustomPane("Right"));
      pane.setBottom(new CustomPane("Bottom"));
      pane.setLeft(new CustomPane("Left"));
      pane.setCenter(new CustomPane("Center"));
      // pane.setAlignment(new TextField(), Pos.CENTER);

      System.out.println(pane.topProperty());
      Scene scene=new Scene(pane);
      primaryStage.setTitle("ShowBorderPane");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   public static void main(String[] args){
      Application.launch(args);
      
   }
    
}
class CustomPane extends StackPane{
   public CustomPane(String title){
      getChildren().add(new Label(title));
      setStyle("-fx-border-color:red");
      setPadding(new Insets(11.5,12.5,13.5,14.5));
   }
}
