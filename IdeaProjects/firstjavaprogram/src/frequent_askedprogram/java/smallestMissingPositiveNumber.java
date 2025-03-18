package frequent_askedprogram.java;
import java .util.*;

public class smallestMissingPositiveNumber {
    public static void main(String[] args) {
        int arr[]={-3,-2,-1,0,1,1,4,5};
        int n= arr.length;
        int ans = 1;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {

            if(arr[i] == ans)
            {
                ans++;
            }else if(arr[i]> ans){
                break;

            }
        }
        System.out.println("the smallest missing positive number are as follows");
        System.out.println(ans);
    }
}
