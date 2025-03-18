package frequent_askedprogram.java;
import java.util.*;
public class lowerTringularAndUpperTringularMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of rows and column");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];
        System.out.println("elements in row and column");
        for (int i = 0; i <rows; i++) {
            for (int j = 0; j <cols; j++) {

                numbers[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <
                    cols; j++) {
                if (j<=i)
                    System.out.print(numbers[i][j]+" ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
