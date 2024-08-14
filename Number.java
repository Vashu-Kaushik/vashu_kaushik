public class Number {
    private final int num;

    // Non-parameterized constructor
    public Number() {
        num = 10; // default value
    }

    // Parameterized constructor
    public Number(int num) {
        this.num = num;
    }

    public void display() {
        System.out.println("The number is: " + num);
    }

    public static void main(String[] args) {
        Number defaultNumber = new Number();
        Number myNumber = new Number(5);

        defaultNumber.display();
        myNumber.display();
    }
}
