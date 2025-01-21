package patternprinting;
import java.util.Scanner;

public class number_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of row or column");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print( i );

            }
            System.out.println();
        }
    }}