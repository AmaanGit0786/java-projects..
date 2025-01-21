package Strings;
import java.util.Arrays;
import java.util.Scanner;

public class leetcode242anagram {
    public static boolean isAnagram(String s,String t) {
        if(s.length()!= t.length()) return false;
        char [] a=s.toCharArray();
        char [] b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        //System.out.println(a+" they are sorted same "+b);
        for (int i=0; i<a.length;i++){
            if(a[i]==b[i])
                return true;
        }
        return false;


    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a= sc.nextLine();
        String b=sc.nextLine();
       System.out.println(isAnagram(a, b));
      if(isAnagram(a, b)==true)
          System.out.println("anagrams");
      else
          System.out.println("not Anagrams");
      }





    }

