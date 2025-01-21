package binarySearch;
import java.util.*;

public class upperboundAndlowerBoundOfelementIngivenArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,5,5,5,5,5,6,7};
        int n=arr.length;
        int lo=0;
        int hi=n-1;
        int target =5;
        int fp=-1;
        int lp=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==target) {
                if (arr[mid] == arr[mid - 1] && mid > 0)
                    hi = mid - 1;
                else {


                    fp = mid;
                    break;
                }
            }
            else if(arr[mid]>target)
                hi=mid-1;
            else if(arr[mid]<target)
                lo=mid+1;
        }
        System.out.println("first position of the element");
        System.out.println(fp);
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==target) {
                if (mid+ 1< n &&arr[mid] == arr[mid + 1])
                    lo=mid+1;
                else {
                    lp = mid;
                    break;
                }
            }
            else if(arr[mid]>target)
                hi=mid-1;
            else if(arr[mid]<target)
                lo=mid+1;
        }
        System.out.println("last position of the element");
        System.out.println(lp);
        }

    }

