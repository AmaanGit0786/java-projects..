package methods;
import java.util.Scanner;

public class assingmentq5 {
    public static int printSquare(int n) {
        int c=n*n;
        int count=1;
        for (int i=1;i<=n;i++){
            n=n/10;
            count++;
        }
        System.out.println("NO. OF DIGITS IN A GIVEN NUMBER:  " +count);
        System.out.println("the square of given number are as follows\n "+c);
return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c = printSquare(n);



    }
}
