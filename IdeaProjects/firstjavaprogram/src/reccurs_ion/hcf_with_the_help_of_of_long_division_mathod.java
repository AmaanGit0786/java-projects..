package reccurs_ion;

import java.util.Scanner;

public class hcf_with_the_help_of_of_long_division_mathod {
    public static int HCf(int a, int b)

    {
       if(b%a==0)
           return a;

return HCf(b%a,a);



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

