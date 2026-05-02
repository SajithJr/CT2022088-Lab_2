package Q7;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight(kg): ");
        int weight = input.nextInt();
        System.out.print("Enter your height(cm): ");
        int height = input.nextInt();

        double heightInMeter = height * 100.0;
        double bmi = weight / (heightInMeter * heightInMeter);

        System.out.println("Your BMI is: " + bmi);

        if (bmi >= 20 && bmi <= 25){
            System.out.println("Status : Normal");
        }else {
            System.out.println("Status : Not in normal range");
        }

        input.close();
    }
}
