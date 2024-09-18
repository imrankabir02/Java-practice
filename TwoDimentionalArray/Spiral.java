package TwoDimentionalArray;
import java.util.*;
public class Spiral {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Row and Column numbers: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];

        System.out.println("Enter rows (" +n+") and columns (" +m+") elements: ");

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The matrix is: ");

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Spiral order of the matrix:");

        printSpiralOrder(matrix, n, m);

        sc.close();
    }

    public static void printSpiralOrder(int matrix[][], int n, int m) {
        int top = 0, bottom = n-1, left = 0, right = m-1;

        while (top <= bottom && left <= right) {
            for(int i=left; i<= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            for(int i=top; i<=bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            if(top <= bottom) {
                for(int i=right; i>= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            if(left <= right) {
                for(int i=bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }
}
