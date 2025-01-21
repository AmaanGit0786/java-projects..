package patternprinting;
import java.util.Scanner;

public class hollo_rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the va;ue of row");
        int n=sc.nextInt();
        System.out.println("Enter the va;ue of cols");
        int m=sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m ; j++) {
                if(i==0||j==0||j==m-1||i==n-1)
                    System.out.print(" * ");
                else
                    System.out.print("   ");

            }
            System.out.println();

        }
    }
}
