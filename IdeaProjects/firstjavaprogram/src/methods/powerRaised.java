package methods;
import java.util.Scanner;

public class powerRaised {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        double result=Math.pow(x,n );
        System.out.println(result);

    }
}
