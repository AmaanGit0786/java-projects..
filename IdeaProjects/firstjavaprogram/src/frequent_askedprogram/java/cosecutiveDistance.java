package frequent_askedprogram.java;
import java.util.*;
public class cosecutiveDistance {
    public static void main(String[] args) {
        // given an unsorted integer nums of longest consecutive elemeent
        int [] arr ={ 100,200,1,2,5,4,6,7,8};
        int n= arr .length;
        Arrays.sort(arr);
        int count_end =  arr[0];
        int count = 1;
        int ans = 1;
        for (int i = 1; i < n ; i++) {
            if(arr[i] == arr[i-1]+1) {

                count++;
            }else {

                count = 1;
            }
            //ans =Math.max(ans, count);
            if(count > ans)
            {
                count_end = arr[i];
                ans =count;
            }
        }

        System.out.println("nums of longest consecutive elemeent :" +ans);
        System.out.println("nums of last consecutive elemeent :" + count_end);
        int count_start = count_end - ans+1;
        System.out.println("the cosecutive element are as follows");
        for (int i = count_start; i <= count_end; i++) {
            System.out.print(i+" ");

        }
    }
}
