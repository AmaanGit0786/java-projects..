package Array.assignment;
public  class secondLargest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 234, 799, 786};
        int n = arr.length;
        int smx = Integer.MIN_VALUE;
        int mx = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            mx = Math.max(arr[i], mx);

        }
        System.out.println();
        for (int i = 1; i < n; i++) {
            if ( arr[i]!=mx)

                smx = Math.max(arr[i],smx);


        }
        System.out.println("the maximum value is---  " +mx);
        System.out.println("the  second maximum value is---  " +smx);

    }
}


