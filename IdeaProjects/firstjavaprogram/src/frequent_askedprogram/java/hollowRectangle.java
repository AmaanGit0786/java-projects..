package frequent_askedprogram.java;
import java.util.Scanner;

public class hollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int n= sc.nextInt();
        int count =0;
        for (int i = 1; i <= n ; i++) {
            for (int j = 0; j <=n ; j++) {
                if(i==1||i==n||j==1||j==n){
                    System.out.print(""+"*"+"");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

    }
}
