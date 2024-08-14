public class MethodsExample {
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    public void nonStaticMethod() {
        System.out.println("This is a non-static method.");
    }

    public static void main(String[] args) {
        staticMethod(); // Call to static method

        MethodsExample obj = new MethodsExample();
        obj.nonStaticMethod(); // Call to non-static method
    }
}
