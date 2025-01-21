package reccurs_ion;
import java.util.Scanner;

public class sumBYparamateriseForm {
    public static void addition(int n, int s) {
        if (n == 0) {
            System.out.println(s);
            return;
        }
        addition(n-1, s + n );
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        addition(n,0);

    }
}
