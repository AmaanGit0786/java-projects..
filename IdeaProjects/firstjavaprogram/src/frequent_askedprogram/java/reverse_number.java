package frequent_askedprogram.java;
import java.util.Scanner;


public class reverse_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rev=0;
        int num=sc.nextInt();
        while(num!=0){
            rev=rev*10+num%10;
            num =num/10;
        }
        System.out.println(rev);
    }
}
