package methods;
import java.util.Scanner;

public class printAllodddnobetrweenA_B {
    public static int printOddNumber(int x, int y) {

        for (int i = x; i <= y; i++) {
             int c = 2 * i - 1;
return c;
        }


        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();
        int odd_number=
        printOddNumber(a,b );
        System.out.println(odd_number);


    }



    }

