package Sortings.java;
import java.util.Scanner;

public class arrayIs_sortedOR_not {
    public static void main(String[] args) {
       int arr[]={1,2,3,4,5,6,7,8,9};
       int n=arr.length;
       Boolean flag=false;
       for(int i=0;i<n-2;i++){
         if(  arr[i] <= arr[i+1]){
             flag=true;
             break;
         }

       }
       if(flag==true){
           System.out.println("the array is sorted");
       }else{
           System.out.println("the array is not sorted");

       }

    }
}


