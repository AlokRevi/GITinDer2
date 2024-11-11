package ClassFiles.ExceptionHandling;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // This will cause an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
            e.printStackTrace();
        }
    }
}
