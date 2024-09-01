public class Sum_of_nonprime {
    public static void main(String[] args) {
        int start = 10; // starting number
        int end = 20; // ending number
        int sumOfNonPrimes = sumOfNonPrimes(start, end);
        int sumOfDigits = sumOfDigits(sumOfNonPrimes);
        System.out.println("Sum of all digits of sum of all non-prime numbers between " + start + " and " + end + " is: " + sumOfDigits);
    }

    // Function to check if a number is prime or not
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to calculate sum of all non-prime numbers between two numbers
    public static int sumOfNonPrimes(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (!isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    // Function to calculate sum of all digits of a number
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}