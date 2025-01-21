package arry2d.java;
import java.util.Scanner;

public class largestElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int m = sc.nextInt();
        System.out.println("enter the number of cols");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();

            }

        }
        int mx=Integer.MIN_VALUE;

        System.out.println("roll no.  " + "marks");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mx=Math.max(arr[j][i],mx);
            }
            System.out.println(mx);
        }
    }
}