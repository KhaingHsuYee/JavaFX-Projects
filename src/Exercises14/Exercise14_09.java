package Exercises14;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Arc;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
public class Exercise14_09 extends Application{
   @Override
   public void start(Stage priamrStage){
      GridPane pane=new GridPane();
      pane.setPadding(new Insets(5, 5, 5, 5));
      pane.setHgap(10);
      pane.setVgap(10);
      for(int i=0;i<2;i++){
         for(int j=0;j<2;j++){
            StackPane fan=new StackPane();
            Circle circle=new Circle(100,100,100);
            circle.setFill(Color.WHITE);
            circle.setStroke(Color.BLACK);
            fan.getChildren().add(circle);
            getArc(fan);
            
            pane.add(fan, j, i);
            
        }
      
      }
      Scene scene=new Scene(pane);
      priamrStage.setTitle("Exercise14_09");
      priamrStage.setScene(scene);
      priamrStage.show();
      
  }

  public void getArc(StackPane stackPane){
   Pane pane=new Pane();
      for(int k=0;k<4;k++){
        
         Arc arc=new Arc(100, 100, 80, 80, (30+k*90), 30);
         arc.setFill(Color.RED);
         arc.setType(ArcType.ROUND);
         pane.getChildren().add(arc);
         
      }
   stackPane.getChildren().add(pane);
  }
  public static void main(String[] args){
      launch(args);
  }
   
}
