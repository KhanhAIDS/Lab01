import java.util.Scanner;
import java.util.Arrays;
public class ArrayCalc {
    public static void main(String[] args) {
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int a = scanner.nextInt();
        double array[] = new double[a];
        System.out.println("Enter the elements of the array: ");
        for (int i=0; i<a; i++) {
            array[i] = scanner.nextDouble();
            sum += array[i];
        }
        Arrays.sort(array);
        System.out.println("The sorted array is: ");
        for (int j=0; j<a; j++) {
            System.out.print(array[j]+" ");
        }
        System.out.println();
        System.out.println("Sum of the array: "+sum);
        System.out.println("Average of the array: "+sum/a);
        scanner.close();
    }
}