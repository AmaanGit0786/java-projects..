package frequent_askedprogram.java;


import java.util.Scanner;

public class decimalToHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        char binary[]  = new char [32];
        int index=0;

        while (decimal > 0){
            int  remainder  =  decimal % 16 ;
            if(remainder>=10) {
                binary[index++] = (char)(remainder + 55);
            }else{
                binary[index++] = (char) (remainder+ 48);

            }
            decimal=decimal / 16;

        }
        System.out.print(" the hexadecimal representation of decimal number are as follows ");
        for (int i = index-1; i >=0; i--) {

            System.out.print(binary[i]);

        }
        System.out.println();


    }
}
