package frequent_askedprogram.java;
import java.util.Scanner;

public class binarytogray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        int j;
        System.out.println("enter the length of binary string");
        int n= sc.nextInt();
        int gray[]=new int[n];
        int binary[]=new int[n];
        System.out.println("binary nymber are as follows");
        for ( i = 0; i < n; i++) {
            binary[i]=sc.nextInt();
        }
        gray[0]=binary[0];
        for ( i = 1 ,j=1 ;i < n;  j++ ,i++) {
            gray[j] = binary[i]^binary[i-1];
            
        }
        for ( i = 0; i < n; i++) {
            System.out.print(gray[i]);
        }

    }
}
