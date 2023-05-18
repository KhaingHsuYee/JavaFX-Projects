package practice16;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
public class CheckBoxDemo extends ButtonDemo{

   @Override
   protected BorderPane getPane(){
      BorderPane pane = super.getPane();

      Font fontBoldItalic = Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,20);
      Font fontBold = Font.font("Times New Roman",FontWeight.BOLD,FontPosture.REGULAR,20);
      Font fontItallic = Font.font("Times New Roman",FontWeight.NORMAL,FontPosture.ITALIC,20);
      Font fontNormal = Font.font("Times New Roman",FontWeight.NORMAL,FontPosture.REGULAR,20);

      text.setFont(fontNormal);

      VBox paneForCheckBoxes = new VBox(20);
      paneForCheckBoxes.setStyle("-fx-border-color:green");
      paneForCheckBoxes.setPadding(new Insets(5,5,5,5));
      CheckBox chkBold = new CheckBox("Bold");
      CheckBox chkItalic = new CheckBox("Italic");
      paneForCheckBoxes.getChildren().addAll(chkBold,chkItalic);
      pane.setRight(paneForCheckBoxes);

      EventHandler<ActionEvent> handler = e->{
         if(chkBold.isSelected() && chkItalic.isSelected()){
            text.setFont(fontBoldItalic);
         }
         else if(chkBold.isSelected()){
            text.setFont(fontBold);
         }
         else if(chkItalic.isSelected()){
            text.setFont(fontItallic);
         }
         else{
            text.setFont(fontNormal);
         }
      };

      chkBold.setOnAction(handler);
      chkItalic.setOnAction(handler);
      
      return pane;
   }
   
   public static void main(String[] args) {
      Application.launch(args);
   }
   
}
