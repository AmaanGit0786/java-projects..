package Array;

public class dutchFlagAlgorithmsortColour {

    public static void print(int[] arr) {


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 1, 1, 1, 1, 0, 0, 0, 0};
        int n = arr.length;
        int lo = 0;
        int mid = 0;
        int hi = n - 1;
        while (mid <= hi) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                 arr[mid] =   arr[lo];
                 arr[lo]= temp;
                 lo++;
                 mid++;
            }
            else if (arr[mid] == 1) {

                mid++;


            }else
            if (arr[mid] == 2) {
                int temp = arr[mid];
                arr[mid] =   arr[hi];
                arr[hi]= temp;
               hi--;

        }
           // print(arr);
    }
        print(arr);}}
