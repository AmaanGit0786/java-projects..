package Array;

public class reverseTheArray {
    public static void print(int []arr) {
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int n=arr.length;
        print(arr);
        // reverse array
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        System.out.println("After reversing ");
        print(arr);
    }
}
