package Array;

import java.util.Arrays;

public class ascndng_order {
    public static void main(String[] args) {
        int[]arr={1,6,5,4,3,2};
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println();
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }
}
