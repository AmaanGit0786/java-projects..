package frequent_askedprogram.java;
import java.util.*;

public class butterfly {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value");
        int n= sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");

            }
            //  System.out.println();
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  " + "  ");

            }
            // System.out.println();
            for (int j = i; j >= 1; j--) {
                System.out.print("*" + " ");

            }
            System.out.println();
        }

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print("*"+" ");

            }

            //  System.out.println();
            for (int j = 1; j <=i-1 ; j++) {
                System.out.print("  "+"  ");

            }
            // System.out.println();
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print("*"+" ");

            }
            System.out.println();

        }
                //System.out.println();

            }
        }


