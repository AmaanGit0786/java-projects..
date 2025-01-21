package cyclicSort;
import java.util.Scanner;


public class missingNumber {
    public static void swap(int i,int j,int[] arr) {
        int temp=arr[i];
        arr[i]=arr[j];
arr[j]=temp;;
    }
    public static void main(String[] args) {
        int arr[]={0,1,2,3,7,5,6};
        int n=arr.length;
        int i=0;
        while( i<n){
            if(arr[i]==i||arr[i]==n)
                i++;
            else
                swap(i,arr[i],arr);
        }
        for( i=0;i<n;i++){
        if(arr[i]!=i)
            System.out.println(arr[i]);

    }}
}
