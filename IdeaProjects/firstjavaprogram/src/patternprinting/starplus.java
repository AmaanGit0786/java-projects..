package patternprinting;
import java .util.*;

public class starplus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter thr value of row");
        int m=sc.nextInt();
        System.out.println("Enter thr value of row");
        int n=sc.nextInt();
        for (int i=1;i<=m;i++ ){
            for(int j=1;j<=n;j++){
                if(i==3||j==3)
                    System.out.print(" * ");
                else
                    System.out.print("   ");


            }
            System.out.println();

        }
    }
}
