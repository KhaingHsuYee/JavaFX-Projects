
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
public class App extends Application{
	@Override
	public void start(Stage primaryStage) {
		GridPane pane=new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(11.5,12.5,13.5,14.5));
		pane.setHgap(5.5);
		pane.setVgap(5.5);
		pane.add(new Label("First Name:"), 0, 0);
		pane.add(new TextField(), 1, 0);
		pane.add(new Label("MI:"), 0, 1);
		pane.add(new TextField(), 1, 1);
		pane.add(new Label("Last Name:"), 0, 2);
		pane.add(new TextField(), 1, 2);
		Button btn=new Button("Add Name");
		pane.add(btn, 1, 3);
		GridPane.setHalignment(btn,HPos.RIGHT );
		Scene scene=new Scene(pane);
		primaryStage.setTitle("ShowGridPlane");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		Application.launch(args);
	}

}
