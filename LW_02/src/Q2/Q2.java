package Q2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter centimeter : ");
        double cm = input.nextDouble();

        double inches = cm / 2.54 ;
        int feet = (int)(inches / 12);
        double remiainiginches = inches % 12;

        System.out.println("feet: " + feet);
        System.out.println("Inches: " + remiainiginches);
    }
}
