
import java.util.Scanner;

public class calc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double a = scanner.nextDouble();

        System.out.println("Enter second number:");
        double b = scanner.nextDouble();

        System.out.println("Enter operator (+, -, *, /):");
        char op = scanner.next().charAt(0);

        double result = execute(a,b,op);

        System.out.println("Result: " + result);

        scanner.close();
    }

    static double execute(double a, double b, char op) {

        double result;

        switch(op) {
            case '+':
                result = a+b;
                break;

            case '-':
                result = a-b;
                break;

            case '*':
                result = a*b;
                break;

            case '/':
                if(b!=0) {
                    result = a/b;
                }
                else {
                    System.out.println("Cannot divide by zero");
                    result = 0;
                }
                break;

            default:
                System.out.println("Invalid operator");
                result = 0;
        }

        return result;
    }
}
