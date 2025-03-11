import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Add the numbers
        int sum = num1 + num2;

        // Print the sum
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Close the scanner object
        scanner.close();
    }
}

