package Q10;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter loan amount: ");
        double loanAmount = input.nextDouble();

        System.out.print("Enter annual interest rate(%): ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter loan period(Years): ");
        int loanPeriod = input.nextInt();

        final int Month_In_Year = 12 ;

        double monthlyInterestRate = annualInterestRate / 100.0 / Month_In_Year;
        int numberOfPayments = loanPeriod * Month_In_Year;

        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 / (1 + monthlyInterestRate), numberOfPayments));

        double totalPayment = monthlyPayment * numberOfPayments;

        System.out.println("Monthly payment " + monthlyPayment);
        System.out.println("Total payment " + totalPayment);
    }
}
