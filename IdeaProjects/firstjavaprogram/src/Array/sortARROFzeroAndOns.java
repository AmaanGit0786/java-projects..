package Array;


import java.util.Arrays;

public class sortARROFzeroAndOns {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 0, 0, 0, 0};
        print(arr);
        int nOfZero = 0;
        int nOfone = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) nOfZero++;
            else nOfone++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (i < nOfZero) arr[i] = 0;
            else
                arr[i] = 1;
        }
        print(arr);

    }
}