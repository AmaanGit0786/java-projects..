package Array.assignment;
import java.util.Scanner;

public class productOfEleent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of element in array");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int product = 1;
        for (int i = 0; i < n; i++) {
            product = arr[i] * product;


        }
        System.out.println(product);
    }
}
