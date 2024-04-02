import java.util.Scanner;

public class DivisibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();

        if (inputNumber % 7 == 0 && inputNumber % 13 == 0) {
            System.out.println(inputNumber + " is divisible by both 7 and 13.");

            int quotientBy7 = inputNumber / 7;
            int remainderBy7 = inputNumber % 7;

            int quotientBy13 = inputNumber / 13;
            int remainderBy13 = inputNumber % 13;

            System.out.println("Quotient when divided by 7: " + quotientBy7);
            System.out.println("Remainder when divided by 7: " + remainderBy7);
            System.out.println("Quotient when divided by 13: " + quotientBy13);
            System.out.println("Remainder when divided by 13: " + remainderBy13);
        } else {
            System.out.println(inputNumber + " is not divisible by both 7 and 13.");
        }

        scanner.close();
    }
}
