package frequent_askedprogram.java;
import java.util.Scanner;
public class interviewQsumuptoSingleDigit {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the digit :");
        int n= sc.nextInt();
        int sum=0;
        while(n > 0){
            int rem= n%10;
            sum= sum+rem;
            n=n/10;


        }
        int sum1=0;

        System.out.println("the sum of digit are as folows : \n"+ sum);
        while(sum>0){
            int rem= sum%10;
            sum1= sum1+rem;
            sum=sum/10;


        }
        System.out.println("the sum of digit until sum is in single digit are as folows : \n"+ sum1);

    }
}
