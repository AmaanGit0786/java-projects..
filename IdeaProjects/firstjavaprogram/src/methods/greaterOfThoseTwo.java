package methods;
import java .util.Scanner;

public class greaterOfThoseTwo {
    public static int calculateGreater(int a, int b) {
        if (a > b) System.out.println(b);

        if (b>a) System.out.println( "This is the greatest number"+b);
        return a ;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();
        calculateGreater( a, b);




    }
}
