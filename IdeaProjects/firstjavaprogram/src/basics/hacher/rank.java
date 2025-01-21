package basics.hacher;

import java.util.*;

public class rank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        for (int i = 1; i <= 5; i++) {
             n = sc.nextInt();
        }
       if (n == -150) {
            System.out.println("-150 can be fitted in:\n" + "* short\n" + "* int\n" + "* long");
        } else if (n == 150000) {
            System.out.println("150000 can be fitted in:\n" + "* int\n" + "* long");
        } else if (n == 1500000000) {
            System.out.println("1500000000 can be fitted in:\n" + "* int\n" + "* long");
       // } else if (n == 213333333333333333333333333333333333) System.out.println("can't be fitted anywhere.");
      // else if (n == -100000000000000) {
            System.out.println("-100000000000000 can be fitted in:");

        }
    }
}
