package binarySearch;
import java.util.*;

public class peakINdex {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,1};
        int n=arr.length;
        int lo=0;
        int hi=n-1;
        int mid = lo + (hi - lo) / 2;
        while(lo<hi) {
             mid = lo + (hi - lo) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                System.out.println(mid + " ");
                break;
            } else if (arr[mid] < arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                hi = mid - 1;
            } else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                lo = mid + 1;
            }
        }





    }
}
