package arry2d.java;
import java.util.Scanner;

public class searcharray {
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
        System.out.println("enter the value of searching elenment in array");
        int x = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <
                 cols; j++) {
                if (numbers[i][j] == x)
                    System.out.print("the location of the element are as follows\n" + i + "  " + j);
            }
            System.out.println();
        }
    }
}
