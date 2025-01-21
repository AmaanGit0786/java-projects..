package arry2d.java;
import java.util.Scanner;

public class simple
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of rows and column");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];
        System.out.println("elements in row and column");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                numbers[i][j] = sc.nextInt();
            }

                }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");

            }
            System.out.println();

        }
    }
}
