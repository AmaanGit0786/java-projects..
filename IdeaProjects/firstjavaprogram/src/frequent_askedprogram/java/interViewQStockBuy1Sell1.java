package frequent_askedprogram.java;
import java .util.*;

public class interViewQStockBuy1Sell1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int arr[]={7,10,1,3,6,9,2};
        int n= arr.length;
        int profit=0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                profit = Math.max(profit,arr[j] - arr[i]);

            }

        }
        System.out.println("the profit is : \n"+ profit);

    }
}
