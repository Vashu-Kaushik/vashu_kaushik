import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int first = scanner.nextInt();
            System.out.print("Enter second number: ");
            int second = scanner.nextInt();

            int sum = first + second;
            System.out.println("Sum: " + sum);
        }
    }
}
