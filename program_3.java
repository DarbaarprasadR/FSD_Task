import java.util.Scanner;

public class program_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int inputNumber = scanner.nextInt();

        int sequenceLength = (inputNumber % 2 == 0) ? inputNumber - 1 : inputNumber;

        for (int index = 0; index < sequenceLength; index++) {
            int oddValue = 2 * index + 1;
            System.out.print(oddValue);
            if (index < sequenceLength - 1) {
                System.out.print(", ");
            }
        }

        scanner.close();
    }
}
