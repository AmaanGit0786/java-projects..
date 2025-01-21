package Array;

import javax.swing.*;

public class mergeTwoSortedArray {
    public static void print(int[] arr) {


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int m = a.length;
        int[] b = {1, 3, 5, 7, 9};
        int n = b.length;
        int[] c = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
                k++;
            } else if (a[i] >= b[j]) {
                c[k] = b[j];
                j++;
                k++;

            }


        }
        print(c);
    }
}