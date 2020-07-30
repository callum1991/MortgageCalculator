import java.text.NumberFormat;

public class MortgageCalculator {
    public static void main(String[] args) {
        GUI ui = new GUI();
        MortgageProcessor calculator = new MortgageProcessor();
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        double principal = ui.fetchPrinicipal();
        double interest = (ui.fetchAnnualInterestRate() / 100);
        int years = ui.fetchPeriod();
        double mortgage = calculator.calculateMonthlyPayment(principal, interest, years);
        ui.displayMonthlyMortgage(formatter.format(mortgage));
    }
}
