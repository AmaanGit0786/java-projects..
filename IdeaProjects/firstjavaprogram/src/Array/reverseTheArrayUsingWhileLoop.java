package Array;

public class reverseTheArrayUsingWhileLoop {
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
        int i=0;
        int j=n-1;
            while(i<=j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            System.out.println("After reversing ");
            print(arr);
        }
    }




