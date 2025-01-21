package Array_list;

public class reverse {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
        System.out.println("the program of reverse array");
        int i = 0;
        int j = n - 1;
        while (i < j) ;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;

        System.out.println(arr[i]);
    }

}