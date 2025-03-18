package frequent_askedprogram.java;
import java.util.*;

public class InterViewQpriceSell {
    public static void main(String[] args) {
        // with O(N) time complexity

        int arr []={7,10,1,3,6,9,2};
        int n= arr.length;
        int profit=0;
        int minValue=arr[0];
        for (int i = 0; i < n; i++) {
             minValue= Math.min(minValue,arr[i]);
            profit =Math.max(profit,arr[i]-minValue);

        }
        System.out.println("the profit is :"+ profit);
    }
}
