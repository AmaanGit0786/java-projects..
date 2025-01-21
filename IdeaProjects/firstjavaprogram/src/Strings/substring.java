package Strings;
import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the value");
        String s=sc.nextLine();
        int n=s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <=6; j++) {
                System.out.print(s.substring(i,j)+" ");

            }
            System.out.println();

        }

        


    }


}
