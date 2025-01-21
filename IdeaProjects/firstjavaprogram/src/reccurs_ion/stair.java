package reccurs_ion;
import java.util.Scanner;
public class stair {
    public static int stairs(int n) {
        if(n==0||n==1||n==2)
            return n;
        return stairs(n-1)+stairs(n-2);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        int j=stairs(n);
        System.out.println(j);

    }
}


