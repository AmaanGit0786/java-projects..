package reccurs_ion;
import java.util.Scanner;

public class fabinacco_series {
    public static int fibo(int n) {
        if(n==0||n==1)
            return n;
        return fibo(n-1)+fibo(n-2);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        int j=fibo(n);
        System.out.println(j);

    }
}
