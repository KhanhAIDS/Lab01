import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double a = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double b = scanner.nextDouble();

        System.out.println("Their sum is: "+(a+b));
        System.out.println("Their difference is: "+(a-b));
        System.out.println("Their product is: "+(a*b));
        
        if (b==0) {
            System.out.println("Their quotient is undefined");
        }
        else {
            System.out.println("Their quotient is: "+(a/b));
        }

        scanner.close();

    }
}