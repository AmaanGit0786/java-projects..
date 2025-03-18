package frequent_askedprogram.java;
import java.util.Scanner;

public class deleteElementInAnArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        int n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the values of arraty element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int position=4;
        System.out.println("the value of element after delete the position ");
        for (int i = 0; i < n; i++) {
            if(i==4)
                continue;
            System.out.print(arr[i]+" ");

        }
    }
}
