package practice15;
import chapter15.Loan;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
public class LoanCalculator extends Application{
   private TextField tfAnnualInterestRate = new TextField();
   private TextField tfNumberOfYears = new TextField();
   private TextField tfLoanAmount = new TextField();
   private TextField tfMontlyPayment = new TextField();
   private TextField tfTotalPayment = new TextField();
   private Button btCalculate = new Button("Calculate");
   @Override
   public void start(Stage primaryStage){
      GridPane gridPane = new GridPane();
      gridPane.setHgap(5);
      gridPane.setVgap(5);
      gridPane.add(new Label("Annual Interest Rate:"),0,0);
      gridPane.add(tfAnnualInterestRate,1,0);
      gridPane.add(new Label("Number of Years:"),0,1);
      gridPane.add(tfNumberOfYears,1,1);
      gridPane.add(new Label("LoanAmount:"),0,2);
      gridPane.add(tfLoanAmount,1,2);
      gridPane.add(new Label("Monthly Payment:"),0,3);
      gridPane.add(tfMontlyPayment,1,3);
      gridPane.add(new Label("Total Payment"),0,4);
      gridPane.add(tfTotalPayment,1,4);
      gridPane.add(btCalculate,1,5);

      gridPane.setAlignment(Pos.CENTER);
      tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
      tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
      tfLoanAmount.setAlignment(Pos.BOTTOM_RIGHT);
      tfMontlyPayment.setAlignment(Pos.BOTTOM_RIGHT);
      tfTotalPayment.setAlignment(Pos.BOTTOM_RIGHT);
      GridPane.setHalignment(btCalculate, HPos.RIGHT);
      tfMontlyPayment.setEditable(false);
      tfTotalPayment.setEditable(false);

      btCalculate.setOnAction(e->calculateLoanPayment());

      Scene scene = new Scene(gridPane,250,250);
      primaryStage.setTitle("LoanCalculator");
      primaryStage.setScene(scene);
      primaryStage.show();
      
   }
   public static void main(String[] args){
      Application.launch(args);
   }

   
   private void calculateLoanPayment(){
      double interest = Double.parseDouble(tfAnnualInterestRate.getText());
      int year = Integer.parseInt(tfNumberOfYears.getText());
      double loanAmount = Double.parseDouble(tfLoanAmount.getText());

      Loan laon = new Loan(interest,year,loanAmount);

      tfMontlyPayment.setText(String.format("$%.2f", laon.getMonthlyPayment()));
      tfTotalPayment.setText(String.format("$%.2f", laon.getTotalPayment()));
   }
   
}
