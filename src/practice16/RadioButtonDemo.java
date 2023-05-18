package practice16;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Insets;
import javafx.scene.paint.Color;
public class RadioButtonDemo extends CheckBoxDemo{
   
   @Override
   protected BorderPane getPane(){
      BorderPane pane = super.getPane();

      VBox paneForRadioButtons = new VBox(20);
      paneForRadioButtons.setStyle("-fx-border-color:green;-fx-border-width:2px");
      paneForRadioButtons.setPadding(new Insets(5,5,5,5));

      RadioButton rdRed = new RadioButton("Red");
      RadioButton rdGreen = new RadioButton("Green");
      RadioButton rdBlue = new RadioButton("Blue");
      paneForRadioButtons.getChildren().addAll(rdRed,rdGreen,rdBlue);
      pane.setLeft(paneForRadioButtons);

      ToggleGroup group = new ToggleGroup();
      rdRed.setToggleGroup(group);
      rdGreen.setToggleGroup(group);
      rdBlue.setToggleGroup(group);

      rdRed.setOnAction(e->{
         if(rdRed.isSelected()){
            text.setFill(Color.RED);
         }
      });
      rdGreen.setOnAction(e->{
         if(rdGreen.isSelected()){
            text.setFill(Color.GREEN);
         }
      });
      rdBlue.setOnAction(e->{
         if(rdBlue.isSelected()){
            text.setFill(Color.BLUE);
         }
      });

      return pane;
   }
   public static void main(String[] args) {
      launch(args);
   }
}
