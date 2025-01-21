package arry2d.java;
import java.util.Scanner;

public class Arrays_of_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of m");
        int m=sc.nextInt();
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("enter the number of element");
        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();


        }
    }
}
