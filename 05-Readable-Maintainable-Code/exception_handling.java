
import java.util.Scanner;
import java.io.IOException;

class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }

}

public class exception_handling {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Basic try-catch
        try {
            int a=10;
            int b=0;
            int result=a/b;
            System.out.println(result);
        }
        catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        // 2. Multiple catch blocks
        try {
            int[] numbers={10,20,30};
            System.out.println(numbers[5]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }
        catch(Exception e) {
            System.out.println("Some other exception occurred");
        }

        // 3. Finally block
        try {
            int result=10/2;
            System.out.println("Result: " + result);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finally block executed");
        }

        // 4. Throw keyword
        try {
            int age=16;

            if(age<18) {
                throw new IllegalArgumentException("Age must be 18 or above");
            }

            System.out.println("Eligible");
        }
        catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // 5. Throws keyword
        try {
            readFile();
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }

        // 6. Custom exception
        try {
            checkAge(17);
        }
        catch(InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        // 7. Scanner input exception
        try {
            System.out.println("Enter a number:");
            int number=scanner.nextInt();
            System.out.println("Number: " + number);
        }
        catch(Exception e) {
            System.out.println("Invalid input");
        }
        finally {
            scanner.close();
        }

    }

    static void readFile() throws IOException {

        throw new IOException("Unable to read file");

    }

    static void checkAge(int age) throws InvalidAgeException {

        if(age<18) {
            throw new InvalidAgeException("Invalid age");
        }

        System.out.println("Age is valid");

    }

}
