package reccurs_ion;
import java.util.Scanner;

public class sumOfNumbers {
    public static int sum(int n) {
        if(n==1)
            return 1;
        return n+sum(n-1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value ");
        int n=sc.nextInt();
        int j=sum (n);
        System.out.println(j);


    }
}

