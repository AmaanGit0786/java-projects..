package Array;

public class rotate_array {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void reverse(int[] arr,int i,int j) {
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        reverse(arr,0,n-1-3);
        print(arr);
        reverse(arr,n-3,n-1);
        print(arr);
        reverse(arr,0,n-1);
        print(arr);

        }



        }


