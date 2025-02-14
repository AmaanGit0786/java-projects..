package frequent_askedprogram.java;
import java.util.*;

public class AbsoluteDiffBetweenSumOfoddANDeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the range of even number");
        int n=sc.nextInt();
        int sumEven=0;
        int sumOdd=0;
        System.out.println("the sum of even number are as follows");
        for (int i = 0; i < n; i+=2) {
            sumEven=sumEven+i;
        }
        System.out.println(sumEven);
        System.out.println("the sum of odd number are as follows");
        for (int i = 1; i <= n; i+=2) {
            sumOdd=sumOdd+i;
        }
        System.out.println(sumOdd);
        System.out.println("the absolute diffrence between sum of even and sum of odd number are as folows :\n" +
                ( sumOdd-sumEven));
    }
}
