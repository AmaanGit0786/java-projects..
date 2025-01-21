package Array.assignment;

public class minValue {
    public static void main(String[] args) {
        int arr[]={10,2,3,4,5,6,7,8,9,};
        int n=arr.length;
        int mn=Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            mn=Math.min(arr[i],mn);


        }
        System.out.println("the min value are given below \n"+mn);
    }
}
