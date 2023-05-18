package Exercises15;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
public class Exercise15_04 extends Application{
   
   @Override
   public void start(Stage primaryStage){
      GridPane gridPane = new GridPane();
      gridPane.setHgap(5);
      gridPane.setVgap(5);
      TextField tf1 = new TextField();
      TextField tf2 = new TextField();
      TextField tf3 = new TextField();
      tf1.setPrefColumnCount(3);
	   tf2.setPrefColumnCount(3);
	   tf3.setPrefColumnCount(3);
      gridPane.add(new Label("Number 1:"), 0, 0);
      gridPane.add(tf1,1,0);
      gridPane.add(new Label("Number 2:"), 2, 0);
      gridPane.add(tf2,3,0);
      gridPane.add(new Label("Result:"), 4, 0);
      gridPane.add(tf3,5,0);
      gridPane.setAlignment(Pos.CENTER);
      tf3.setEditable(false);



      HBox hbox = new HBox(5);
      Button btAdd = new Button("Add");
      Button btSubtract = new Button("Subtract");
      Button btMultiply = new Button("Multiply");
      Button btDivide = new Button("Divide");
      hbox.getChildren().addAll(btAdd,btSubtract,btMultiply,btDivide);
      hbox.setAlignment(Pos.CENTER);

      BorderPane pane = new BorderPane();
      pane.setCenter(gridPane);
      pane.setBottom(hbox);
      pane.setAlignment(gridPane, Pos.CENTER);

      

      btAdd.setOnAction(e->{
         double n1 = Double.parseDouble(tf1.getText());
         double n2 = Double.parseDouble(tf2.getText());
         double n=n1+n2;
         tf3.setText(n+"");
      });
      btSubtract.setOnAction(e->{
         double n1 = Double.parseDouble(tf1.getText());
        double n2 = Double.parseDouble(tf2.getText());
         double n=n1-n2;
         tf3.setText(n+"");
      });
      btMultiply.setOnAction(e->{
         double n1 = Double.parseDouble(tf1.getText());
        double n2 = Double.parseDouble(tf2.getText());
         double n=n1*n2;
         tf3.setText(n+"");
      });
      btDivide.setOnAction(e->{
         double n1 = Double.parseDouble(tf1.getText());
      double n2 = Double.parseDouble(tf2.getText());
         double n=n1/n2;
         tf3.setText(n+"");
      });
      
      Scene scene = new Scene(pane,400,100);
      primaryStage.setTitle("Exercise15_04");
      primaryStage.setScene(scene);
      primaryStage.show();
      
   }
   public static void main(String[] args){
      launch(args);
   }
   
}
