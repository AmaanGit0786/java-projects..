package reccurs_ion;
import java.util.Scanner;

public class Hcfrec {
    public static int HCf(int a, int b)

    {
        for( int i=Math.min(a,b);i>=1;i--){
            if(a%i==0&&b%i==0)
                return i;

        }
        return 1;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();
        System.out.println(HCf(a,b));


    }
}
