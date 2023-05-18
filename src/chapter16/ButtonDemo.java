package chapter16;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
public class ButtonDemo extends Application{
   protected Text text=new Text(50,50,"JavaFX Programming");

   protected BorderPane getPane(){
      HBox paneForButton =new HBox(20);
      Button btLeft=new Button("Left");
      Button btRight=new Button("Right");
      paneForButton.getChildren().addAll(btLeft,btRight);
      paneForButton.setAlignment(Pos.CENTER);
      paneForButton.setStyle("-fx-border-color:green");
      BorderPane pane=new BorderPane();
      pane.setBottom(paneForButton);
      Pane paneForText=new Pane();
      paneForText.getChildren().add(text);
      pane.setCenter(paneForText);

      btLeft.setOnAction(e->text.setX(text.getX()-10));
      btRight.setOnAction(e->text.setX(text.getX()+10));

      return pane;
   }


   @Override
   public void start(Stage primaryStage){
      Scene scene=new Scene(getPane(),450,200);
      primaryStage.setScene(scene);
      primaryStage.setTitle("ButtonDemo");
      primaryStage.show();

   }
   public static void main(String[] args){
      launch(args);
   }
   
}
