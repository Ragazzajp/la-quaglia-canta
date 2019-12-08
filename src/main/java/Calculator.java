import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        System.out.println("Please enter the first number:");
        // Get first number using Scanner
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Please enter the second number:");
        // Get second number using Scanner
        int num2 = scanner.nextInt();
        System.out.println("Please select an operation:");
        int op = scanner.nextInt();

        if (op == 1) {
            System.out.println(num1 + num2);
        } else if (op == 2) {
            System.out.println(num1 - num2);
        } else if (op == 3) {
            System.out.println(num1 * num2);
        } else {
            System.out.println(num1 / num2);
            // Do operation based on the option the user entered
            // Print result
        }
    }
}