package reccurs_ion;
import java.util.Scanner;

public class print_num_nTo1 {
    public static void print(int n) {
        if(n==0) return ;
            System.out.println(n);
         print(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int n= sc.nextInt();
        print(n);
        //System.out.println(j);
    }
}
