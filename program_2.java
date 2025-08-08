import java.util.Scanner;

public class program_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many odd numbers would you like to see? ");
        int countLimit = sc.nextInt();

        int printedCount = 0;
        int currentOdd = 1;

        while (printedCount < countLimit) {
            System.out.print(currentOdd);
            printedCount++;
            currentOdd += 2;

            if (printedCount < countLimit) {
                System.out.print(", ");
            }
        }
        sc.close();
    }
}
