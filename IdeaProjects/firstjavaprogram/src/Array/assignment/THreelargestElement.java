package Array.assignment;

public class THreelargestElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        int mx1 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            mx1 = Math.max(mx1, arr[i]);
        }
        System.out.println();
        int mx2 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (mx1 != arr[i])

                mx2 = Math.max(mx2, arr[i]);
        }
        System.out.println();
        int mx3 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (mx1 != arr[i])
                if(mx2!=arr[i])
            mx3 = Math.max(mx3, arr[i]);
        }
        System.out.println("The three largest element of the given array are as follws\n"
                + mx1 + " " + mx2 + " "+mx3);
    }
}