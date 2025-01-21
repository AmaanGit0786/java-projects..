package Strings;

import java.util.Arrays;

public class SortOFstring {
    public static void main(String[] args) {
        String S = "Amaan";
        char ch[] = {'a', 'm', 'a', 'a', 'n'};//char ch[]=s.tocharArray..
        for (char ele : ch) {
            System.out.print(ele);
        }
        System.out.println();
        Arrays.sort(ch);
        for (char ele : ch) {
            System.out.print(ele);
        }
        System.out.println();
    }
}
