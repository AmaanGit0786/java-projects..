package Sortings.java;
// Q10. Given an array of strings arr[] with all strings in lowercase. Sort given strings using Bubble Sort and
//display the sorted array.
import java.util.*;
public class assingmentjava {
    public static void main(String[] args) {

        String s="edcba";
        char arr[]=s.toCharArray();
        int n=arr.length;
        Arrays.sort(arr);
        // System.out.println(arr);

        for(int x=0;x<n;x++){
            for(int i=0;i<n-1;i++)
            {
                if(arr[i]>arr[i+1])
                {
                    char temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
                // System.out.print(arr[i]);
            }

        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}