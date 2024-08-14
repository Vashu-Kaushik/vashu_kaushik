import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = scanner.nextInt();
            int result = 1;
            
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            
            System.out.println("Factorial of " + n + " is: " + result);
        }
    }
}
