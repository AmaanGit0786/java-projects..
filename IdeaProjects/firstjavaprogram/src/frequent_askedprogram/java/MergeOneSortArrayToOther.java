package frequent_askedprogram.java;
import java.util.*;

public class MergeOneSortArrayToOther {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 0, 0, 0};
        int n = arr.length;
        int[] brr = {2, 5, 6};
        int m = brr.length;
        int k = n-m;
        int i = k - 1;
        int j = m - 1;
        while ( j >=0 ) {
            if (arr[i] > brr[j]) {
                arr[--n] = arr[i];
                i--;

            } else
                if (arr[i] < brr[j]) {
                    arr[--n] = brr[j];
                    j--;
                }
        }
            System.out.println("the merge sorted array are as follows");
            for (int ele : arr){
                System.out.print(ele+" ");
                



        }
       }}
