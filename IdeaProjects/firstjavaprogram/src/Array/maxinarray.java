package Array;

public class maxinarray {
    public static void main(String[] args) {
        int[]arr={2,7,9,0,65,786};
        int max=arr[0];//int.MIN_VALUE
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];

        }
        System.out.println(max);
    }
}
