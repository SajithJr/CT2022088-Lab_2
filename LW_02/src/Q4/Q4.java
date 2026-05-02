package Q4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter body weight(in pounds): ");
        double bodyWeight = input.nextDouble();

        double calories = bodyWeight * 19 ;
        System.out.print("Calories needed per day: " + calories);
    }
}

