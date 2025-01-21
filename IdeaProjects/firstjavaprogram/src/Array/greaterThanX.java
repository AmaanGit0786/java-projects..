package Array;


public class greaterThanX {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        int x=3;
       int  count =0;
        System.out.println("the number which is greater than x are as follows");

        for (int i=0;i<n;i++){
            if(arr[i]>x)
                count++;
            if(arr[i]>x)
            System.out.print(arr[i]+" ");


        }
        System.out.println(" with their counting ="+count);
    }
}
