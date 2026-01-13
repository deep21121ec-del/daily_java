//Implemented a single Java program demonstrating multiple core concepts:
//        - Leap year validation using Gregorian rules
//- Multiplication table generation
//- HCF and LCM calculation using Euclidean algorithm
//- Continuous input summation until sentinel value 'x'
//
//Each logic is separated into reusable static methods with clear input handling.

import java.util.Scanner;
public class Assignment_1 {

    // Single Scanner used across the program
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        // Leap year check
        System.out.print("Enter a Year: ");
        int year = in.nextInt();
        checkLeapYear(year);

        // Multiplication table
        System.out.print("\nEnter a Number: ");
        int num = in.nextInt();
        multiplication(num);

        // HCF and LCM
        System.out.print("\nEnter HCF A & B: ");
        int a = in.nextInt();
        int b = in.nextInt();
        findHCF_LCM(a, b);

        // Sum numbers until 'x'
        int totalSum = countNumberUntil_x();
        System.out.println("Sum of entered numbers: " + totalSum);
    }

    /**
     * Reads numbers until user enters 'x' or 'X'
     * @return sum of entered numbers
     */
    static int countNumberUntil_x() {

        System.out.print("\nEnter numbers and 'x' to stop: ");
        int total = 0;

        while (true) {
            String input = in.next();

            // Stop condition
            if (input.equalsIgnoreCase("x")) {
                return total;
            }

            // Convert string to integer and add
            total += Integer.parseInt(input);
        }
    }

    /**
     * Finds HCF and LCM using Euclidean algorithm
     */
    static void findHCF_LCM(int a, int b) {

        int originalA = a;
        int originalB = b;

        // Euclidean algorithm for HCF
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int hcf = a;
        int lcm = (originalA * originalB) / hcf;

        System.out.println("HCF of " + originalA + " and " + originalB + " is: " + hcf);
        System.out.println("LCM of " + originalA + " and " + originalB + " is: " + lcm);
    }

    /**
     * Prints multiplication table up to 20
     */
    static void multiplication(int num) {

        for (int i = 1; i <= 20; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

    /**
     * Checks whether a year is leap year or not
     */
    static void checkLeapYear(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Year " + year + " is a Leap Year");
        } else {
            System.out.println("Year " + year + " is not a Leap Year");
        }
    }
}
