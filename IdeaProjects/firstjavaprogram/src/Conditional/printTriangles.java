package Conditional;
import java.util.Scanner;

public class printTriangles {
    public static void printTriangle(int a,int b,int c) {
        if (a == b && b == c) {
            System.out.println("equilateral Triangle");
        } else if (a == b || b == c) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalen Triangle");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the value of first side of triangle ");
        int a=sc.nextInt();
        System.out.println("Enter the value of second side of triangle ");
        int b=sc.nextInt();
        System.out.println("Enter the value of third side of triangle ");
        int c=sc.nextInt();
        printTriangle(a,b, c);

    }
}
