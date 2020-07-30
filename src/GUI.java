import java.lang.System;
import java.util.Scanner;

public class GUI {
    Scanner input = new Scanner(System.in);
    double fetchPrinicipal(){
        System.out.print("Principal: ");
        double value = input.nextDouble();
        return value;
    }

    double fetchAnnualInterestRate(){
        System.out.print("Annual Interest Rate: ");
        double InterestRate = input.nextDouble();
        return InterestRate;
    }

    int fetchPeriod(){
        System.out.print("Period (Years): ");
        int years = input.nextInt();
        return years;
    }

    void displayMonthlyMortgage(String mortgage){
        System.out.println("Mortgage Payment: " + mortgage);
    }

}
