package Array_list;

import java.util.Arrays;

public class ascending_order {
    public static void main(String[] args) {
        int[] arr = {1, 2, 9, 8, 7, 6, 5, 4, 3};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            Arrays.sort(arr);


        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}