package Q6;

import java.util.Scanner;
import java.time.Year;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int birthyear = input.nextInt();

        int currenYear = Year.now().getValue();

        int age = currenYear - birthyear;

        System.out.print("Your were born in " + birthyear + " and will be (are) " + age + " this year.");
        input.close();
    }
}
