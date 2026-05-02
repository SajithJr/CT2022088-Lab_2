package Q5;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double Fahrenheit = input.nextDouble();

        double celsius = (5.0 / 9) * (Fahrenheit - 32) ;

        System.out.println("Temperature in Celsius is " + celsius);
    }
}
