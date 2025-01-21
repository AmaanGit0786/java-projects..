package reccurs_ion;
import java.util.Scanner;

public class factorial {
    public static int fact(int n) {
        if(n==1)
            return 1;
         return n*fact(n-1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int j=fact (n);
        System.out.println(j);


    }
}
