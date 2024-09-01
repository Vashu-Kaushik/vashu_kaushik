import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the lower bound: ");
            int lowerBound = scanner.nextInt();
            System.out.print("Enter the upper bound: ");
            int upperBound = scanner.nextInt();

            System.out.println("Prime numbers between " + lowerBound + " and " + upperBound + ":");
            for (int i = lowerBound; i <= upperBound; i++) {
                if (isPrime(i)) {
                    System.out.println(i);
                }
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}