import java.util.Scanner;

public class program_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();

        System.out.println("Choose an operation:");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");

        int option = input.nextInt();
        int result;

        switch (option) {
            case 1:
                result = firstNumber + secondNumber;
                System.out.println("Sum: " + result);
                break;
            case 2:
                result = firstNumber - secondNumber;
                System.out.println("Difference: " + result);
                break;
            case 3:
                result = firstNumber * secondNumber;
                System.out.println("Product: " + result);
                break;
            case 4:
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                    System.out.println("Quotient: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid menu option. Please restart and try again.");
        }

        input.close();
    }
}
