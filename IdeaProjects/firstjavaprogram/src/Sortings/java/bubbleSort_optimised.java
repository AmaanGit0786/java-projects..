package Sortings.java;

public class bubbleSort_optimised {
    public static void print(int [] arr){
        for (int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,4,3,-1};
        int n=arr.length;
        //int i = 0;
        for (int x = 0; x < n; x++) {
           // boolean flag=true;
            for (int  i = 0; i < n-1; i++) {
                if (arr[i]>arr[i+1]){
                    int temp =arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            //if(flag==true) break;
            }
        print(arr);
    }
}
