package Conditional;
import java.util.Scanner;

public class printAtleastThreenuber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        System.out.println("enter second number");
        int c = sc.nextInt();
        if (a < b) {
            if (a < c) {
                System.out.println("the least num is :" + a);
            } else {
                System.out.println("the least num is :" + c);
            }
        } else if (b < c) {
            System.out.println("the least num is :" + b);
        } else {
            System.out.println("the least num is :" + c);
        }
    }
}