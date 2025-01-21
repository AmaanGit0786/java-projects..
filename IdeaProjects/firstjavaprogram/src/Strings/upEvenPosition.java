package Strings;
import java.util.Scanner;

public class upEvenPosition {
    public static void main(String[] args) {
        String a=" amaan ";
        String b="";
       int  n=a.length();
        for (int i=0;i<n;i++){
            if(i%2==0)
                b+='a';
            else
                b+=a.charAt(i);
        }
        System.out.println(b);
    }
}
