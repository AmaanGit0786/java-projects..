package frequent_askedprogram.java;

public class firstOccurance {
    public static void main(String[] args) {
        int[] arr = { 2,4,4,5,5,5,5,6,7,7,7,8,8};
        int x=5;
        int n= arr .length;
        int ans =-1;
       int left =0;
       int right =n-1;
        while(left <= right){
            int mid = (left + right)/2;
            if(x == arr[mid]){

                 ans =mid;
                // System.out.println(mid);
                right = mid -1;
            }else if( x < arr[mid]){
                right =mid-1;

            } else{

                left = mid+1;
            }
        }
        System.out.println(ans);

        }

    }

