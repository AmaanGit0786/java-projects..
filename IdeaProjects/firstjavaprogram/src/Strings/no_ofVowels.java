package Strings;
import java.util.Scanner;

public class no_ofVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of string");
        String s=sc.nextLine();
        int n=s.length();
        int count=0;
        for (int i=0;i<=n;i++) {
            char ch=s.charAt(i);
            if(ch=='a'||ch=='i'||ch=='o'||ch=='u'||ch=='e')count++;
        }
        System.out.println(count);



    }
}
