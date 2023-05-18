package chapter16;



import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.control.CheckBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
public class CheckBoxDemo extends ButtonDemo{
   
   @Override
   protected BorderPane getPane(){
      BorderPane pane=super.getPane();
      Font fontBoldItalic=Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,20);
      Font fontBold=Font.font("Times New Roman",FontWeight.BOLD,FontPosture.REGULAR,20);
      Font fontItalic=Font.font("Times New Roman",FontWeight.NORMAL,FontPosture.ITALIC,20);
      Font fontNormal=Font.font("Times New Roman",FontWeight.NORMAL,FontPosture.REGULAR,20);

      text.setFont(fontNormal);

      VBox paneForCheckBoxes=new VBox(20);
      paneForCheckBoxes.setPadding(new Insets(5, 5, 5, 5));
      CheckBox chkBold=new CheckBox("Bold");
      CheckBox chkItalic=new CheckBox("Italic");
      paneForCheckBoxes.getChildren().addAll(chkBold,chkItalic);
      pane.setRight(paneForCheckBoxes);

      EventHandler<ActionEvent> handler=e->{
         if(chkBold.isSelected() && chkItalic.isSelected()){
            text.setFont(fontBoldItalic);
         }
         else if(chkBold.isSelected()){
            text.setFont(fontBold);
         }
         else if(chkItalic.isSelected()){
            text.setFont(fontItalic);
         }
         else{
            text.setFont(fontNormal);
         }
      };
      chkBold.setOnAction(handler);
      chkItalic.setOnAction(handler);

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
