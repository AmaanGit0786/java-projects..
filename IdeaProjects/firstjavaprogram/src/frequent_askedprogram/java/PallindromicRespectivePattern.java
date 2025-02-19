package frequent_askedprogram.java;
import java.util.*;
public class PallindromicRespectivePattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n= sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print((char)(j+64)+" ");
            }
           // System.out.println();
            for (int j = i; j >=1 ; j--) {
                System.out.print((char)(j+64-2)+" ");

            }
            System.out.println();

        }

    }
}
