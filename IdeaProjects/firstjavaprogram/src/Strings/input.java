package Strings;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder(sc.nextLine());

        /*toggle case question */
        int n=sb.length();
        for (int i = 0; i < n; i++) {
            char chh= sb.charAt(i);
            int asci= (int) chh;
            if(asci>=65&&asci<=90){

            asci+=32;
            chh=(char)asci;
          sb.setCharAt(i,chh);




        } else if(asci>=97&&asci<=122)

                asci-=32;
            chh=(char)asci;
            sb.setCharAt(i,chh); {

            }


        }
        System.out.println(sb);
}
}
