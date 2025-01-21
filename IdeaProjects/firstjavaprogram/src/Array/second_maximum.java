package Array;

public class second_maximum {
    public static void main(String[] args) {
        int[] arr = {2, 45, 67, 89, 97, 45};
        int mx = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {

            mx = Math.max(mx, arr[i]);
        }
        int smx = Integer.MIN_VALUE;
        int w = arr.length;
        for (int i = 0; i < w; i++) {
            if(arr[i]!=mx)

            smx = Math.max(smx, arr[i]);

        }
        System.out.println("the maximum value \n"+mx+"\nthe sec minimum value\n"+smx);
    }
}
