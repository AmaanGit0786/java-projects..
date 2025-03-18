package frequent_askedprogram.java;
import java.util.*;

public class duplicateORmissing {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,5};
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");

        }
        Arrays.sort(arr);
        int sum=0;
        System.out.println("\n sorted array");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
            sum+=arr[i];

        }
        int duplicate=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==arr[i+1]){
                duplicate =arr[i];
               break;
            }
        }
        System.out.println(" \nDuplicate element are as follows :"+ duplicate);
        System.out.println();
        int w=n*(n+1)/2;
        System.out.println("sum Of n natural number in the give array :"+ w);
        System.out.println("sum Of  number in the give array :"+ sum);
        System.out.println("the missing number of the array are as follows :" +(w-sum+duplicate));
    }
}
