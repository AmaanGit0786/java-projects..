package binarySearch;

public class jAVA {
    public static void main(String[] args) {
        int []arr={5,7,9,7};
        int n=arr.length;
        int Goal=9;
        int lo=0;
        int hi=n-1;
        int mid=lo+(hi-lo)/2;
         //boolean flag=false;
        int pos=-9999;
        for (int i = 0; i <n-1 ; i++) {
            mid=lo+(hi-lo)/2;
            if(arr[mid]==Goal) {
               pos=mid;
                break;
            } else if (arr[mid]<Goal)
            {
                lo=mid+1;

            } else if (arr[mid]>Goal) {
                hi=mid-1;



            }


        }
        System.out.println("the positio of the element which we are try to find is  :"+ pos);
        if(pos==mid) System.out.println("element found");
        else
            System.out.println("element not found");
       }
}