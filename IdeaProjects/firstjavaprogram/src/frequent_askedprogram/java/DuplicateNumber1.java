package frequent_askedprogram.java;
import java.util.Scanner;
public class DuplicateNumber1 {
    public static void main(String[] args) {
        int count =0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        int n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the values of arraty element");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }

            }
        }
            System.out.println("the number of duplicate elements in the array are as follows :"+count);



    }
}
