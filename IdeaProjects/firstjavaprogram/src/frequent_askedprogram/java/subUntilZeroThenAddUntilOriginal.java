package frequent_askedprogram.java;
import java.util.*;

public class subUntilZeroThenAddUntilOriginal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n");
         int n= sc.nextInt();
        System.out.println("Enter the value of k");
        int k= sc.nextInt();
        int num=n;

        while(n>0){
            System.out.print(n+" ");
            n-=k;
        }

        while(n<=num){
            System.out.print(n+" ");
            n+=k;

        }


    }
}
