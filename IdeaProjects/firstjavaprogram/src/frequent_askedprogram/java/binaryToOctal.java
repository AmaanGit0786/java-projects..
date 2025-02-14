package frequent_askedprogram.java;
import java.util.*;

public class binaryToOctal {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter binary digit");
        int n=sc.nextInt();
        int power=0;
        int decimal=0;
        while(n>0){
            int rem= n%10;
            decimal += rem * Math.pow(2,power);
            n=n/10;
            power++;
        }
        System.out.println("the value of decimal nuber is are as follows =");
        System.out.println(decimal);
        // decimal to octal
        int oct=0;
       while(decimal!=0){
           int rem=decimal%8;
           oct=oct*10+rem;
           decimal=decimal/8;

       }
        System.out.println("the value of octal number is are as follows =");
        System.out.println(oct);

    }
}
