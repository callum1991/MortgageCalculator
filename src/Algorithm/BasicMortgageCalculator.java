package Algorithm;

import Model.MortgageDetails;

public class BasicMortgageCalculator {
    private double monthlyMortgage;

    public void calculate(MortgageDetails mortgageDetails) {
        double monthlyInterest = mortgageDetails.getMonthlyInterest();
        double fullInterestMultiplier = Math.pow(monthlyInterest + 1, mortgageDetails.getLength());
        this.monthlyMortgage = mortgageDetails.getPrincipal() * (monthlyInterest * fullInterestMultiplier) / (fullInterestMultiplier - 1);
    }

    public double getMonthlyMortgage() {
        return monthlyMortgage;
    }
}