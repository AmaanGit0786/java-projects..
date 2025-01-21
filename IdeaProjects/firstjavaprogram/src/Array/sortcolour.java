package Array;

public class sortcolour {
    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0};
        int n = arr.length;
        int n0fz = 0;
        int n0fo = 0;
        int n0ft = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) n0fz++;
            if (arr[i] == 1) n0fo++;
            if (arr[i] == 2) n0ft++;
        }
        for (int i = 0; i < n; i++) {
            if (i < n0fz)
                arr[i] = 0;
          else   if (i>=n0ft+n0fz)
                arr[i] = 2;
            else arr[i] = 1;
        }
        for(int ele:arr)
        System.out.print(ele+" ");
    }
}