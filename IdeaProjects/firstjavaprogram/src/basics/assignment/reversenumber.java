package basics.assignment;
import java. util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
         int n= sc.nextInt();
        while(n>0){
            int r=n%10;
            System.out.print(r);
            n/=10;


        }

    }

}
