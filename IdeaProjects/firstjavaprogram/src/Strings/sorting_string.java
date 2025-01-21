package Strings;
import java.util.Arrays;
import java.util.Scanner;



public class sorting_string {
    public static void main(String[] args) {
        String s="satyam jaiswal";
        char[] ch={'a','m','a','a','n'};
        Arrays.sort(ch);
        System.out.println(ch);
        // now for string
        char[] chh=s.toCharArray();
        Arrays.sort(chh);
        System.out.println(chh);
        //now for Stringt builder
        StringBuilder sb = new StringBuilder("nadeem");
        char[]arr=sb.toString().toCharArray();
        Arrays.sort(arr);
        System.out.println(sb);



    }


    }
