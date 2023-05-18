package Exercises15;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.collections.ObservableList;
public class Exercise15_15 extends Application{
   @Override
   public void start(Stage primaryStage){
      Pane pane = new Pane();
      pane.setOnMouseClicked(e->{
         if(e.getButton() == MouseButton.PRIMARY){
            Circle circle = new Circle(e.getX(),e.getY(),5);
            circle.setFill(Color.WHITE);
            circle.setStroke(Color.BLACK);
            pane.getChildren().add(circle);
         }
         else if(e.getButton()==MouseButton.SECONDARY){
            ObservableList<Node> list =pane.getChildren();
            for(int i=0;i<list.size();i++){

               Circle circle =(Circle) list.get(i);
               if(circle.contains(e.getX(),e.getY())){
                  list.remove(i);
                  //or pane.getChildren().remove(circle);
               }

            }
         }
      });
      Scene scene=new Scene(pane,250,250);
      primaryStage.setTitle("Exercise15_15");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   public static void main(String[] args) {
      Application.launch(args);
   }
}
