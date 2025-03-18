package frequent_askedprogram.java;

import java.util.Scanner;

public class GrayToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        int j;
        System.out.println("enter the length of Gray");
        int n= sc.nextInt();
        int gray[]=new int[n];
        int binary[]=new int[n];
        System.out.println("gray nymber are as follows");
        for ( i = 0; i < n; i++) {
            gray[i]=sc.nextInt();
        }
     binary[0]=   gray[0];
        for ( i = 1 ,j=1 ;i < n;  j++ ,i++) {
            binary[j] = binary[i-1]^gray[i];

        }
        for ( i = 0; i < n; i++) {
            System.out.print(binary[i]);
        }

    }
}
