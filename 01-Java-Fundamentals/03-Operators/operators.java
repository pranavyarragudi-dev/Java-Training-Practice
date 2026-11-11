
public class operators {
    public static void main(String[] args) {

        int a = 20;
        int b = 10;

        System.out.println("Addition: " + (a+b));
        System.out.println("Subtraction: " + (a-b));
        System.out.println("Multiplication: " + (a*b));
        System.out.println("Division: " + (a/b));
        System.out.println("Modulus: " + (a%b));

        System.out.println("Equal: " + (a==b));
        System.out.println("Greater: " + (a>b));
        System.out.println("Logical AND: " + (a>b && b>5));

        a++;
        System.out.println("Increment: " + a);
    }
}
