import java.util.Scanner;
//Implemented a Java practice program covering:
//        - Fibonacci series generation up to a given limit
//- Palindrome string validation using two-pointer technique
//- Armstrong number verification without using Math.pow()
//
//Each task is modularized into separate static methods with clear input handling.

public class assign_3 {

    // Shared Scanner for all inputs
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        // Fibonacci series until end value
        fibonacciSeriesTillEndNumber();

        // Palindrome check
        System.out.print("Enter Your Name: ");
        String name = in.next();
        boolean isPalindrome = checkPalindromeString(name.toLowerCase());

        if (isPalindrome) {
            System.out.println("Given Name " + name + " is Palindrome");
        } else {
            System.out.println("Given Name " + name + " is Not Palindrome");
        }

        // Armstrong number check
        checkArmstrong();
    }

    /**
     * Prints Fibonacci series until it exceeds given end number
     */
    static void fibonacciSeriesTillEndNumber() {

        System.out.print("Enter End Number: ");
        int end = in.nextInt();

        int a = 0;
        int b = 1;

        do {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        } while (a <= end);

        System.out.println();
    }

    /**
     * Checks whether a string is palindrome
     */
    static boolean checkPalindromeString(String name) {

        int start = 0;
        int end = name.length() - 1;

        while (start < end) {
            if (name.charAt(start) != name.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    /**
     * Checks whether a number is an Armstrong number
     * Implementation avoids using Math.pow(base, expo)
     */
    static void checkArmstrong() {

        System.out.print("Enter a Number: ");
        int num = in.nextInt();

        int original = num;
        int digits = String.valueOf(num).length();
        int sum = 0;

        // Process each digit
        while (num != 0) {
            int lastDigit = num % 10;
            int power = 1;

            // Compute lastDigit^digits manually
            for (int i = 1; i <= digits; i++) {
                power *= lastDigit;
            }

            sum += power;
            num /= 10;
        }

        if (original == sum) {
            System.out.println("Given number " + original + " is an Armstrong Number");
        } else {
            System.out.println("Given number " + original + " is NOT an Armstrong Number");
        }
    }
}
