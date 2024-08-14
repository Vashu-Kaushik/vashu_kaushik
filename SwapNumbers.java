import java.util.Scanner;

public class SwapNumbers {
    private int a;
    private int b;

    public void getData() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            a = scanner.nextInt();
            System.out.print("Enter second number: ");
            b = scanner.nextInt();
        }
    }

    public void swapping() {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        SwapNumbers swap = new SwapNumbers();
        swap.getData();
        swap.swapping();
    }
}
