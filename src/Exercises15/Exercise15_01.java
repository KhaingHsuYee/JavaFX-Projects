package Exercises15;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import java.util.ArrayList;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
public class Exercise15_01 extends Application{
   ArrayList<Integer> cards;
   @Override
   public void start(Stage primaryStage){
      BorderPane pane = new BorderPane();
      HBox hbox = new HBox(10);
      hbox.setPadding(new Insets(10, 10, 10, 10));
      cards = getCards();
      for(int i=0;i<4;i++){
         hbox.getChildren().add(new ImageView("image/card/"+cards.get(i)+".png"));
      }
      Button button = new Button("Refresh");
      pane.setCenter(hbox);
      pane.setBottom(button);
      pane.setAlignment(button, Pos.TOP_CENTER);
      pane.setPadding(new Insets(10, 10, 10, 10));


      button.setOnMouseClicked(e->{
         hbox.getChildren().clear();
         cards = getCards();
         for(int i=0;i<4;i++){
            hbox.getChildren().add(new ImageView("image/card/"+cards.get(i)+".png"));
         }
      });
      Scene scene = new Scene(pane);
      primaryStage.setTitle("Exercise15_01");
      primaryStage.setScene(scene);
      primaryStage.show();
      
   }
   public static void main(String[] args){
      Application.launch(args);
   }

   private ArrayList<Integer> getCards() {
      ArrayList<Integer> cards = new ArrayList<>();
      for(int i=0;i<52;i++){
         cards.add(i+1);
      }
      java.util.Collections.shuffle(cards);
      return cards;
   }
   
}
