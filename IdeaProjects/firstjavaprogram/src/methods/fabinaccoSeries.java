package methods;
import java.util.Scanner;

public class fabinaccoSeries {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int f1=0;
        int f2=1;
        int n=sc.nextInt();
        System.out.println("enter the value upto which faboinacconseries goes "+n);
        for (int i=1;i<=n;i++){
            System.out.print(f1+++" ");
        }
        int result =f1+f2;
        f1=f2;
        result=f2;


        System.out.println(result);


    }
    }

