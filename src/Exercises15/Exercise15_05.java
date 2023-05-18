package Exercises15;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
public class Exercise15_05 extends Application{

   private TextField tfInvestmentAmount = new TextField();
   private TextField tfNumberOfYears = new TextField();
   private TextField tfAnnuaInterestRate = new TextField();
   private TextField tfFutureValue = new TextField();
   private Button btCalculate = new Button("Calculate");

   @Override
   public void start(Stage primaryStage){
      // TODO Auto-generated method stub
      GridPane gridPane = new GridPane();
      gridPane.setHgap(5);
      gridPane.setVgap(5);
      gridPane.add(new Label("Investment Amount:"),0,0);
      gridPane.add(tfInvestmentAmount,1,0);
      gridPane.add(new Label("Number of Years:"),0,1);
      gridPane.add(tfNumberOfYears,1,1);
      gridPane.add(new Label("Annual Interest Rate:"),0,2);
      gridPane.add(tfAnnuaInterestRate,1,2);
      gridPane.add(new Label("Future value:"),0,3);
      gridPane.add(tfFutureValue,1,3);
      gridPane.add(btCalculate, 1, 4); 
      
      gridPane.setAlignment(Pos.CENTER);
      tfInvestmentAmount.setAlignment(Pos.BASELINE_RIGHT);
      tfNumberOfYears.setAlignment(Pos.BASELINE_RIGHT);
      tfAnnuaInterestRate.setAlignment(Pos.BASELINE_RIGHT);
      tfFutureValue.setAlignment(Pos.BASELINE_RIGHT);
      gridPane.setHalignment(btCalculate, HPos.RIGHT);
      tfFutureValue.setEditable(false);

      btCalculate.setOnAction(e->{
         calculateFutureValue();
      });
      Scene scene = new Scene(gridPane);
      primaryStage.setTitle("Exercise15_05");
      primaryStage.setScene(scene);
      primaryStage.show();
      
   }
   private void calculateFutureValue() {
      double investmentAmount = Double.parseDouble(tfInvestmentAmount.getText());
      int years = Integer.parseInt(tfNumberOfYears.getText());
      double annualInterestRate = Double.parseDouble(tfAnnuaInterestRate.getText());
      double monthlyInterestRate = annualInterestRate/1200;
      double futureValue = investmentAmount * Math.pow((1+monthlyInterestRate),years*12);
      tfFutureValue.setText(String.format("$%.2f", futureValue));
   }
   public static void main(String[] args){
      launch(args);
   }
   
}
