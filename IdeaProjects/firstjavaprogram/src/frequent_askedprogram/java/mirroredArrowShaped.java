package frequent_askedprogram.java;
import java.util.Scanner;

public class mirroredArrowShaped {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        int n=sc.nextInt();
        System.out.println("the given ARROW pattern are as follows :" );

        for (int i=1;i<=n;i++) {

            for (int j = 1; j <=n-i; j += 1) {
                System.out.print("   ");


            }
            for (int j = 1; j <= i; j += 1) {
                System.out.print(" * ");


            }
            System.out.println();

        }
        for (int i=1;i<=n;i++) {

            for (int j = 1; j <=i; j += 1) {
                System.out.print("   ");


            }
            for (int j = 1; j <= n-i; j += 1) {
                System.out.print(" * ");


            }
            System.out.println();

        }


    }
}
