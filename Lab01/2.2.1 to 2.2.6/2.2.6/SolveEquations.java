import java.util.Scanner;

public class SolveEquations {
    public static void main(String[] args) {
        
        System.out.println("Choose a type of equations to be solved by entering its corresponding number: ");
        System.out.println("1. First-degree equation (linear equation) with one variable");
        System.out.println("2. System of first-degree equations (linear system) with two variables");
        System.out.println("3. Second-degree equation with one variable");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();

        switch(choose) {
            case 1: System.out.println("Assume the form of the equation is ax + b = 0");
            System.out.println("Please enter the \"a\" number: ");
            double first = scanner.nextDouble();
            System.out.println("Please enter the \"b\" number: ");
            double second = scanner.nextDouble();
            if (first==0.0) {
                if (second==0.0) {
                    System.out.println("The equation has infinitely many solutions");
                    break;
                }
                else {
                    System.out.println("The equation has no solutions");
                    break;
                }
            }
            else {
                System.out.println("The solution of the equation is: "+(-second)/first);
                break;
            }
            case 2: System.out.println("Assume the form of the equation is:\n ax + by = c\n a'x + b'y = c'");
            System.out.println("Please enter the \"a\" number: ");
            double a = scanner.nextDouble();
            System.out.println("Please enter the \"b\" number: ");
            double b = scanner.nextDouble();
            System.out.println("Please enter the \"c\" number: ");
            double c = scanner.nextDouble();
            System.out.println("Please enter the \"a'\" number: ");
            double A = scanner.nextDouble();
            System.out.println("Please enter the \"b'\" number: ");
            double B = scanner.nextDouble();
            System.out.println("Please enter the \"c'\" number: ");
            double C = scanner.nextDouble();

            double d = a*B-b*A;
            double d2 = c*B-b*C;
            double d3 = a*C-c*A;
            if (d!=0) {
                System.out.println("The solutions of this system of equations are: "+d2/d+", "+d3/d);
                break;
            }
            else {
                if (d2==0 && d3==0) {
                    System.out.println("The system of equations has infinitely many solutions");
                    break;
                }
                else {
                    System.out.println("This system of equations has no solutions");
                    break;
                }
            }
            case 3: System.out.println("Assume the form of the equation is ax^2 + bx + c = 0");
            System.out.println("Please enter the \"a\" number: ");
            double x = scanner.nextDouble();
            System.out.println("Please enter the \"b\" number: ");
            double y = scanner.nextDouble();
            System.out.println("Please enter the \"c\" number: ");
            double z = scanner.nextDouble();

            double dis = y*y-4*x*z;
            if (x==0.0) {
                if (y==0.0) {
                    if (z==0.0) {
                        System.out.println("The equation has infinitely many solutions");
                        break;
                    }
                    else {
                        System.out.println("The equation has no solutions");
                        break;
                    }
                }
                else {
                    System.out.println("The solution of the equation is: "+(-z)/y);
                    break;
                }
            }
            else {
                if (dis>0.0) {
                    System.out.println("The equation has 2 distinct real number solutions");
                    System.out.println("The solutions of the equation are: "+(-y-Math.sqrt(dis))/2/x+", "+(-y+Math.sqrt(dis))/2/x);
                    break;
                }
                else if (dis==0.0) {
                    System.out.println("The equation has a repeated real number solution");
                    System.out.println("The solution of the equation is: "+(-y)/2/x);
                    break;
                }
                else {
                    System.out.println("The equation has no real number solution");
                    System.out.println("The solutions of the equation are: "+-y/2/x+"-"+Math.sqrt(-dis)/2/x+"*i, "+-y/2/x+"+"+Math.sqrt(-dis)/2/x+"*i");
                    break;
                }
            }
            default: System.out.println("That isn't a valid choice");
        }

        scanner.close();

    }
}