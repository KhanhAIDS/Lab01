import  java.util.Scanner;
public class StarTriangle {
    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("How high do you want the triangle to be?");
        int h = scanner.nextInt();
        for (int i=1; i<=h; i++) {
            System.out.println();
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
        }
        scanner.close();
    }
}
