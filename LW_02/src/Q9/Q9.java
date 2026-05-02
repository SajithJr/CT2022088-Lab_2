package Q9;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principle amount(p): ");
        double p = input.nextDouble();

        System.out.print("Enter interest rate(R): ");
        double r = input.nextDouble();

        System.out.print("Enter number of years(N): ");
        int N = input.nextInt();

        double A = p * Math.pow( 1+ r /100,N);

        System.out.println("amount after " + N + "years: " + A );
        input.close();
    }
}
