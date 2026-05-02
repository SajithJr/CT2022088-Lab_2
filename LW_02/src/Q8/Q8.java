package Q8;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radious of the sphere: ");
        double radious = input.nextDouble();

        double pi = 3.14;
        double volume = (4.0/3.0) * pi * radious * radious * radious ;

        System.out.println("Volume of the sphere is " + volume);
        input.close();
    }
}
