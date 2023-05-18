package practice15;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Circle;
import javafx.scene.control.Button;

public class ControlCircle extends Application {
   private CirclePane circlePane = new CirclePane();
   @Override
  
   public void start(Stage primarStage){
      HBox hbox = new HBox();
      hbox.setSpacing(10);
      hbox.setAlignment(Pos.CENTER);
      Button btEnlarge = new Button("Enlarge");
      Button btShrink = new Button("Shrink");
      hbox.getChildren().addAll(btEnlarge,btShrink);

      btEnlarge.setOnAction(new EnlargeHandler());
      btShrink.setOnAction(new ShrinkHandler());

      BorderPane borderPane = new BorderPane();
      borderPane.setCenter(circlePane);
      borderPane.setBottom(hbox);
      borderPane.setAlignment(hbox, Pos.CENTER);

      Scene scene = new Scene(borderPane,200,150);
      primarStage.setTitle("ControlCircle");
      primarStage.setScene(scene);
      primarStage.show();

   }
   class EnlargeHandler implements EventHandler<ActionEvent>{
      @Override
      public void handle(ActionEvent e){
         circlePane.enlarge();
   
      }
   }
   class ShrinkHandler implements EventHandler<ActionEvent>{
      @Override
      public void handle(ActionEvent e){
         circlePane.shrink();
      }
   }
   public static void main(String[] args){
      launch(args);
   }
   
}


class CirclePane extends StackPane{
   private Circle circle = new Circle(50);

   public CirclePane(){
      getChildren().add(circle);
      circle.setFill(Color.WHITE);
      circle.setStroke(Color.BLACK);
   }
   public void enlarge(){
      circle.setRadius(circle.getRadius()+2);
   }
   public void shrink(){
      circle.setRadius(circle.getRadius()>2 ? circle.getRadius()-2: circle.getRadius());
   }
}
