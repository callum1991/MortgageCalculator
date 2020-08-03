package Model;

public class MortgageDetails {
    private double principal;
    private double yearsRemaining;
    private double monthlyInterest;

    public MortgageDetails() {
        this.principal = 0;
        this.yearsRemaining = 0;
        this.monthlyInterest = 0;
    }

    public double getPrincipal() {
        return this.principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getLength() {
        return this.yearsRemaining;
    }

    public void setLength(double yearsRemaining) {
        this.yearsRemaining = yearsRemaining * 12;
    }

    public double getMonthlyInterest() {
        return monthlyInterest;
    }

    public void setInterest(double interest) {
        this.monthlyInterest = interest / 1200; // we split interest by 12 for the monthly rate
        // and by 100 to convert the rate to the decimal value
    }
}