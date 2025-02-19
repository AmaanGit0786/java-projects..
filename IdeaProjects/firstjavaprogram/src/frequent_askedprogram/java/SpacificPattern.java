package frequent_askedprogram.java;
import java.util.Scanner;
public class SpacificPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int n= sc.nextInt();
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if( i==1 || j==1 || i==n ||j==n){
                    System.out.print(" 1 ");
                } else if (i==j || j==n-i+1) {
                    System.out.print(" 0 ");
                }else {
                    System.out.print("   ");


                }

            }
            System.out.println();
        }
    }
}
