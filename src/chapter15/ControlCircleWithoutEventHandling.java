package chapter15;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
public class ControlCircleWithoutEventHandling extends Application {
   @Override
   public void start(Stage primarStage){
      StackPane pane=new StackPane();
      Circle circle=new Circle(50);
      circle.setStroke(Color.BLACK);
      circle.setFill(Color.WHITE);
      pane.getChildren().add(circle);

      HBox hBox=new HBox();
      hBox.setAlignment(Pos.CENTER);
      hBox.setSpacing(10);
      Button btEnlarge=new Button("Enlarge");
      Button btShrink=new Button("Shrink");
      hBox.getChildren().add(btEnlarge);
      hBox.getChildren().add(btShrink);

      BorderPane borderPane=new BorderPane();
      borderPane.setCenter(pane);
      borderPane.setBottom(hBox);
      borderPane.setAlignment(borderPane, Pos.CENTER);

      Scene scene=new Scene(borderPane,200,150);
      primarStage.setTitle("ControlCircle");
      primarStage.setScene(scene);
      primarStage.show();
   

   }
   public static void main(String[] args){
      Application.launch(args);
   }
}
