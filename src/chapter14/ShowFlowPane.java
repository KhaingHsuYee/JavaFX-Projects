package chapter14;

import javax.swing.GroupLayout.Alignment;

import javafx.application.Application;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;

public class ShowFlowPane extends Application{
    @Override
    public void start(Stage PrimaryStage){
        FlowPane pane=new FlowPane();
        pane.setPadding(new Insets(11, 12, 13, 14));
        pane.setHgap(5);
        pane.setVgap(5);
        System.out.println(pane.getHgap());
        System.out.println(pane.getVgap());
        System.out.println(new FlowPane().hgapProperty());

        // pane.setOrientation(Orientation.VERTICAL);
        pane.setAlignment(Pos.CENTER);

        pane.getChildren().addAll(new Label("First Name:"),new TextField(),new Label("MI:"));
        TextField tfmi=new TextField();
        tfmi.setPrefColumnCount(5);
        pane.getChildren().addAll(tfmi,new Label("Last Name:"),new TextField());
        Scene scene=new Scene(pane,200,250);
        PrimaryStage.setTitle("ShowFlowPane");
        FlowPane fp=new FlowPane();
        System.out.println(fp.vgapProperty());
        PrimaryStage.setScene(scene);
        PrimaryStage.show();

    }
    public static void main(String[] args){
        Application.launch(args);
        System.out.println(new FlowPane().hgapProperty());
    }
    
}
