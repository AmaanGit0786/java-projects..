package frequent_askedprogram.java;
import java.util.Scanner;
public class perfectNumberSeries {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value");
        int n= sc.nextInt();
        int sum=0;
        for (int i = 1; i <=n ; i++) {
            System.out.print(sum+",");
            sum=sum+i;

        }

    }
}
