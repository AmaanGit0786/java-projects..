package Strings;
import javax.print.attribute.IntegerSyntax;
import java.util.Scanner;

public class maxOccuranceCharf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int freq[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = (int) ch - 97;
            freq[idx]++;

            //System.out.print(idx+ "  " );
            // System.out.print(ch+"\n ");

        }
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < freq.length; i++) {
            mx = Math.max(freq[i], mx);


        }
        for (int i = 0; i < freq.length; i++) {
            char ch = (char) (i + 97);
            if(freq[i]==mx)
            System.out.println(ch);


        }
    }
}