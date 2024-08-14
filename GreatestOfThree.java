import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int a = scanner.nextInt();
            System.out.print("Enter second number: ");
            int b = scanner.nextInt();
            System.out.print("Enter third number: ");
            int c = scanner.nextInt();

            int greatest = a > b ? (a > c ? a : c) : (b > c ? b : c);
            System.out.println("The greatest number is: " + greatest);
        }
    }
}
