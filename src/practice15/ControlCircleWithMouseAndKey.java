package practice15;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class ControlCircleWithMouseAndKey extends Application{
   private CirclePane circlePane = new CirclePane();
   @Override
   public void start(Stage primarStage){
      HBox hBox = new HBox();
      hBox.setSpacing(10);
      hBox.setAlignment(Pos.CENTER);
      Button btEnlarge = new Button("Enlarge");
      Button btShrink = new Button("Shrink");
      hBox.getChildren().addAll(btEnlarge,btShrink);
      btEnlarge.setOnAction(e->circlePane.enlarge());
      btShrink.setOnAction(e->{circlePane.shrink();});
      
      circlePane.setOnMouseClicked(e->{
         if(e.getButton() == MouseButton.PRIMARY){
            circlePane.enlarge();
         }
         else if(e.getButton() == MouseButton.SECONDARY){
            circlePane.shrink();
         }
      });

      circlePane.setOnKeyPressed(e->{
         if(e.getCode() == KeyCode.U){
            circlePane.enlarge();
         }
         else if(e.getCode() == KeyCode.D){
            circlePane.shrink();
         }
      });

      BorderPane borderPane =new BorderPane();
      borderPane.setCenter(circlePane);
      borderPane.setBottom(hBox);

      Scene scene = new Scene(borderPane,200,150);
      primarStage.setTitle("CotrolCircle");
      primarStage.setScene(scene);
      primarStage.show();

      circlePane.requestFocus();

      
   }
   public static void main(String[] args){
      Application.launch(args);
   }
   
}
