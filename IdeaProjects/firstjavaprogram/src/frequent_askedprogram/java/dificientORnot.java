package frequent_askedprogram.java;
import java.util.Scanner;

public class dificientORnot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value ofnumber");
        int n= sc.nextInt();
        int sum=0;
        for (int i=1;i<=n/2; i++){
            if(n%i==0){
                sum=sum+i;
            }

        }
        System.out.println(sum);
        if(sum<n)
            System.out.println("difficient number");
        else
            System.out.println(" not difficient number");


    }
}
