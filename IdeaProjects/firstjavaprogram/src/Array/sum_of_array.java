package Array;

public class sum_of_array {
    public static void main(String[] args) {
        int[]arr={2,2,2,2,2,2,2,2,2,2};
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];


        }
        System.out.println("the sum of given array are as follows");
        System.out.println(sum);
    }
}
