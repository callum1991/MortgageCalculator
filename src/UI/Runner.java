package UI;

import Algorithm.BasicMortgageCalculator;
import Model.MortgageDetails;
import Tools.InputRequest;

import java.text.NumberFormat;

public class Runner {

    public static void main(String[] args) {
        MortgageDetails mortgage = new MortgageDetails();
        BasicMortgageCalculator calculator = new BasicMortgageCalculator();
        InputRequest request = new InputRequest();
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        mortgage.setPrincipal(request.fetchDouble("Principal: "));
        mortgage.setInterest(request.fetchDouble("Annual Interest Rate: "));
        mortgage.setLength(request.fetchDouble("Mortgage Length (Years): "));

        calculator.calculate(mortgage);
        displayMonthlyMortgage(formatter.format(calculator.getMonthlyMortgage()));
    }

    private static void displayMonthlyMortgage(String format) {
        System.out.println("Monthly Cost: " + format);
    }
}