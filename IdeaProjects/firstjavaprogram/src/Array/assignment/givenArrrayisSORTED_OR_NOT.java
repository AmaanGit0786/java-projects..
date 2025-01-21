package Array.assignment;
import java.util.Scanner;
import java.util.Arrays;

public class givenArrrayisSORTED_OR_NOT {
    public static void main(String[] args) {
        int arr[] = {22,33,55,44,99,88};
        int n = arr.length;
        for (int i = 1; i < n; i++) {
           if(arr[i]<arr[i-1])
               System.out.println("the array is not sorted  " +arr[i-1]+"  " + arr[i]+"  ");
else
    System.out.println("The array is sorted");

        }
    }
}