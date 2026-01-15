//Implemented a Java practice program demonstrating loop-based logic:
//- Printed all factors of a given number
//- Calculated sum of user inputs until sentinel value 0
//- Determined the maximum value from user inputs until 0
//Each task is modularized into reusable static methods with clear input handling.


import java.util.Scanner;

public class Assignment_4 {

    // Shared Scanner for input
    static Scanner in = new Scanner(System.in);

    /**
     * Prints all factors of a given number
     */
    static void allFactor(int num) {

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    /**
     * Reads numbers until 0 is entered and returns the maximum value
     */
    static double maxUnit0() {

        double max = Double.MIN_VALUE;
        System.out.print("Enter numbers and '0' to stop: ");

        while (true) {
            double num = in.nextDouble();

            if (num == 0) {
                break;
            }

            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    /**
     * Reads numbers until 0 is entered and returns their sum
     */
    static double sumUnit0() {

        double sum = 0;
        System.out.print("Enter numbers and '0' to stop: ");

        while (true) {
            double num = in.nextDouble();

            if (num == 0) {
                break;
            }

            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {

        // Factor calculation
        System.out.print("Enter a Number: ");
        int num = in.nextInt();
        allFactor(num);

        // Sum until 0
        double sum = sumUnit0();
        System.out.printf("Sum of numbers before '0': %.2f%n", sum);

        // Max until 0
        double max = maxUnit0();
        System.out.println("Max of numbers before '0': " + max);
    }
}
