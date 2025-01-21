package arry2d.java;
import java.util.Scanner;

public class transpose_of_Matrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of rows");
        int m = sc.nextInt();
        System.out.println("Enter the value of cols");
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("enter the value of matrix ____________----___________");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
        System.out.println("after transpose the matrix");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(arr[j][i]+" ");
            }
            System.out.println();

        }
    }}