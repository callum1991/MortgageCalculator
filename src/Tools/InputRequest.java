package Tools;

import java.util.Scanner;

public class InputRequest {
    Scanner input = new Scanner(System.in);

    public double fetchDouble(String request) {
        System.out.print(request);
        double value = input.nextDouble();
        return value;
    }
}