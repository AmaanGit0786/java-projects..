package Array;
import java.util.Scanner;

public class max_and_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();


        }
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                arr[i] = max;

            }


            if (max < arr[i]) {
                arr[i] = max;

            }

        }
        System.out.println("the largest value is" + max);
    }}