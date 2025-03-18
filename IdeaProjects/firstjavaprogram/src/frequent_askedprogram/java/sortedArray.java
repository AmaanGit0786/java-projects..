package frequent_askedprogram.java;
import java.util.*;

public class sortedArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value");
        int n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the values of arraty element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }

            }}
            for (int i = 0; i < n; i++) {
                System.out.println(                arr[i]
                );


        }



        }




    }

