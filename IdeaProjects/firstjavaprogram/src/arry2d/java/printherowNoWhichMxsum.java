package arry2d.java;
import java.util.Scanner;

public class printherowNoWhichMxsum {
    public static void main(String[] args) {
        int[][] arr = {{1, 3, 2,}, {4, 5, 6}, {9, 0, 8}};
        for (int i = 0; i < arr.length; i++) {
            int sum_row=0;
            System.out.println("sum of row  "+ i);
            for (int j = 0; j < arr[0].length; j++) {
               // System.out.println("sum of first"+i);
              sum_row=sum_row+arr[i][j];

            }

            System.out.println(sum_row);


        }
    }
}