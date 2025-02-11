package frequent_askedprogram.java;

import java.util.Scanner;

public class decimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        int binary[]  = new int [32];
        int index=0;

        while (decimal > 0){
            int  remainder  =  decimal % 8 ;
            binary[index++]= remainder;
            decimal=decimal / 8;

        }
        System.out.print(" the octal representation of decimal number are as follows ");
        for (int i = index-1; i >=0; i--) {
            System.out.print(binary[i]);

        }
        System.out.println();


    }
}
