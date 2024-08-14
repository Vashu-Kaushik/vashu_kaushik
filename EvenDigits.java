import java.util.Scanner;

public class EvenDigits {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            int evenCount = 0;
            
            while (number > 0) {
                int digit = number % 10;
                if (digit % 2 == 0) {
                    evenCount++;
                }
                number /= 10;
            }

            System.out.println("Count of even digits: " + evenCount);
        }
    }
}
