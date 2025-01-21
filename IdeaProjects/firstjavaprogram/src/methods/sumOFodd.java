package methods;
import java.util.Scanner;

public class sumOFodd {
    public static int caculateOddSum( int n ) {
        int sum=0;
        for (int i=1;i<=n;i+=2){
            System.out.print(i+" +");
            sum=sum+i;

        }
        System.out.println( " 0 \n ="+sum+"  ");
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=caculateOddSum(  n );

    }
}
