public class PrimeNumbersTo100 {
    public static void main(String[] args) {
        int num = 100;
        System.out.println("Prime numbers from 1 to 100 are:");
        for (int i = 1; i <= num; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
