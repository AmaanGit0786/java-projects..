package patternprinting;
import java.util.Scanner;

public class odd_number_tringle {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for (int i=1;i<=n;i++){
           for (int j=1;j<=i;j++)
           {
               System.out.print(2*j-1);

           }
           System.out.println();
       }
    }
}
