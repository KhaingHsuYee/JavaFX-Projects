package chapter16;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class RadioButtonDemo extends CheckBoxDemo {
   @Override
   protected BorderPane getPane(){

      BorderPane pane=super.getPane();
      VBox paneForRadioButtons =new VBox();
      paneForRadioButtons.setPadding(new Insets(5, 5, 5, 5));
      paneForRadioButtons.setStyle("-fx-border-width:2px; -fx-border-color: green");
      RadioButton rtRed=new RadioButton("Red");
      RadioButton rtGreen=new RadioButton("Green");
      RadioButton rtBlue=new RadioButton("Blue");
      paneForRadioButtons.getChildren().addAll(rtRed,rtGreen,rtBlue);
      pane.setLeft(paneForRadioButtons);
      
      ToggleGroup group=new ToggleGroup();
      rtRed.setToggleGroup(group);
      rtGreen.setToggleGroup(group);
      rtBlue.setToggleGroup(group);

      rtRed.setOnAction(e->{
         if(rtRed.isSelected()){
            text.setFill(Color.RED);
         }
      });
      rtGreen.setOnAction(e->{
         if(rtGreen.isSelected()){
            text.setFill(Color.GREEN);
         }
      });
      rtBlue.setOnAction(e->{
         if(rtBlue.isSelected()){
            text.setFill(Color.BLUE);
         }
      });
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
