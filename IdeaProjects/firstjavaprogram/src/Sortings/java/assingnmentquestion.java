package Sortings.java;
import java .util.Scanner;
// Q9. Given an array of digits (values are from 0 to 9), the task is to find the minimum possible sum of two
//numbers formed from digits of the array. Please note that all digits of the given array must be used to form
//the two numbers.

public class assingnmentquestion {
    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,5,6,7,8,9};
        int min=Integer.MAX_VALUE;
        int smin=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            min=Math.min(arr[i],min);
        }

        for(int i=0;i<arr.length;i++)
        {
            if(min!=arr[i])
                smin=Math.min(arr[i],smin);
        }
        System.out.println("the minimum possible sum of two numbers ");
        System.out.println(min+" + "+smin);
        int result =min+smin;
        System.out.println(" = "+result);
    }
}




