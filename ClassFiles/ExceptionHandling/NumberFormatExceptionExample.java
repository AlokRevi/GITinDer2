package ClassFiles.ExceptionHandling;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        String numberString = "abc";  // Not a valid integer
        try {
            int number = Integer.parseInt(numberString);  // This will cause a NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Error: Cannot convert the string to a number.");
            e.printStackTrace();
        }
        finally{
            System.out.println("Your code is jinxed.");
            }
        }
}

