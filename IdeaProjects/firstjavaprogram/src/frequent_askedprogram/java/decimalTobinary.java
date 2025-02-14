package frequent_askedprogram.java;
import java.util.*;
public class decimalTobinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int power=0;
        int decimal=0;
        while(n>0){
            int rem= n%10;
            decimal += rem * Math.pow(2,power);
            n=n/10;
            power++;
        }
        System.out.println("the value of decimal nuber is are as follows =\n");
        System.out.println(decimal);
        // decimal to octal

    }
}
