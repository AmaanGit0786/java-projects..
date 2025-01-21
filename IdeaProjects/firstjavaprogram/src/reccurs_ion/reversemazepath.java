package reccurs_ion;

import java.util.Scanner;

public class reversemazepath{
    public static int maze( int m, int n) {
        if(m==1||n==1)
            return 1;
        int rightways=maze( m,n-1);
        int downways=maze(m-1,n);
        return rightways +downways;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of end row  m \n =");
        int m=sc.nextInt();
        System.out.println("enter the value of end col  n \n =");
        int n=sc.nextInt();
        System.out.println(maze(m,n));


    }
}
