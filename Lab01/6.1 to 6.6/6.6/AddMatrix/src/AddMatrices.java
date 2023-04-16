import java.util.Scanner;
public class AddMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter the numbers of columns: ");
        int columns = scanner.nextInt();
        double[][] matrix1 = new double[rows][columns];
        double[][] matrix2 = new double[rows][columns];
        System.out.println("Enter the elements of matrix 1: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix1[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("Enter the elements of matrix 2: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix2[i][j] = scanner.nextDouble();
            }
        }
        double[][] matrix3 = new double[rows][columns];
        for(int k = 0; k < rows; k++) {
            for (int l = 0; l < columns; l++) {
                matrix3[k][l] = matrix1[k][l] + matrix2[k][l];
            }
        }
        System.out.println("The sum matrix of the 2 matrices is: ");
        for(int k = 0; k < rows; k++) {
            System.out.println();
            for (int l = 0; l < columns; l++) {
                System.out.print(matrix3[k][l] + " ");
            }
        }
        scanner.close();
    }
}