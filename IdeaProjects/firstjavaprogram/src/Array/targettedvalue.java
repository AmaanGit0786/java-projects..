package Array;
import java.util.Scanner;

public class targettedvalue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter targeted element");
        int x=sc.nextInt();
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter elements of array");
        for (int i=1;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=1;i<n;i++){
        if (arr[i]==x)
            System.out.println("NO.was found");
        else
            System.out.println("NO.was not found");


    }
}}
