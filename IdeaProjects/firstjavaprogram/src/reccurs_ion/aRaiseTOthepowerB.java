package reccurs_ion;
import java.util.Scanner;

public class aRaiseTOthepowerB {
    public static int power(int a,int b) {
        //time complexity o{2};
        if(b==0)
            return 1;
        else
            return a* power(a,b-1);
    }
    public static int powerlog(int a,int b) {
        //time complexity O{log2}
        if(b==0)
            return 1;
      int ans=powerlog(a,b/2);
      if(b%2==0)
            return ans*ans;
      else
          return a*ans*ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the base value");
        int a =sc.nextInt();
        System.out.println("enter the power value");
        int b =sc.nextInt();
      int j=  powerlog( a, b);
        System.out.println(j);
    }
}
