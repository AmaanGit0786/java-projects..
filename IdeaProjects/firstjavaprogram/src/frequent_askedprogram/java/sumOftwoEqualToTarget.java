package frequent_askedprogram.java;
import java .util.*;

public class sumOftwoEqualToTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of th e target");
        int target = sc.nextInt();
        int arr [] ={3,4,5,6,7,8,9};
        int n= arr.length;
        int left =0;
        int right =n-1;
        int sum =0;
        while(left <= right){

            sum= arr[right] + arr[left];

            if(sum==target){
                System.out.println(sum+" = " +arr[right] + " + " +arr[left]);
               left++;
               right--;
//break;
        }else if(sum > target){
                right--;
            } else{
                left--;
            }

        }

    }
}
