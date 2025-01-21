package arry2d.java;
import java.util.Scanner;
public class storeTenAteveryIdxOftwoDarray {
    public static void main(String[] args) {

        int [][]arr=new int[5][5];
         Scanner sc   = new Scanner(System.in) ;
         for (int i = 0; i < 5; i++) {
             for (int j = 0; j < 5; j++) {
                 arr[i][j] = sc.nextInt();
             }
         }

         for (int i = 0; i < 5; i++) {
         for (int j = 0; j < 5; j++) {
             System.out.print(arr[i][j]+"  ");
         }
             System.out.println();
             }
    }
}
