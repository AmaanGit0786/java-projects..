package binarySearch;
import java.util.Scanner;

public class lowerBound {
    public static void main(String[] args) {
       int arr[]={1,2,3,4,5,6,6,6,6,6,7,7,8};
       int n=arr.length;
       int lo=0;
       int hi=n-1;
       int target=6;
       int lb=n;
       while(lo<=hi){
           int mid=lo+(hi-lo)/2;
           if(arr[mid]>=target){
               lb=Math.min(lb,mid);
               hi=mid-1;
           }
               else{
                   lo=mid+1;
           }

       }
        System.out.println("the lower bound of the target element :");
        System.out.println(lb+" ");
    }
}