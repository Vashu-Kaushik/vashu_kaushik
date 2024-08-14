import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            int sum = 0;
            
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }
            
            System.out.println("Sum of the digits is: " + sum);
        }
    }
}
