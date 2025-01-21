package methods;
import java.util.Scanner;

public class assingment_q1 {
    public static int calculateSquare(int n){
        int s=n*n;
        return s;
    }
    public static void main(String[] args) {
        Scanner scp= new Scanner(System.in);
        System.out.println("ENTER THE VALUE FOR WHICH YOU WOULD LIKE TO CALCULATE SQUARE ");
        int n=scp.nextInt();

        int s=calculateSquare( n);
        System.out.println("The square of "+n+" is :");
        System.out.println(s);

        //square of first n natural number


    }
}
