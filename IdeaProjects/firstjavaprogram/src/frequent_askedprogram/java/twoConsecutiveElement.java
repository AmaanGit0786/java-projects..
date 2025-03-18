package frequent_askedprogram.java;
import java.util.Scanner;

public class twoConsecutiveElement {
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
        for (int i = 0; i < n - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        System.out.println("the swapping array are as folows :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");

        }
      //  System.out.println();
            }
        }



