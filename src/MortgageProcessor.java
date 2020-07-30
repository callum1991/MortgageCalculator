import static java.lang.Math.pow;

public class MortgageProcessor {
    double calculateMonthlyPayment(double principal, double interest, int years) {
        int months = years * 12;
        double monthlyInterest = interest / 12;
        double fullInterestMultiplier = Math.pow((1 + monthlyInterest), months);
        double mortagePayment = principal * (monthlyInterest * fullInterestMultiplier) / (fullInterestMultiplier - 1);
        return mortagePayment;
    }
}
