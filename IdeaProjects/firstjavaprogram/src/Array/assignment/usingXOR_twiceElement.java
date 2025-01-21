package Array.assignment;

public class usingXOR_twiceElement {
    public static void main(String[] args) {
        int arr[]={2,3,2,3,4,5,4,5,8,8,6,7,11};
        int n=arr.length;
        int val=0;
        for (int i = 0; i < n; i++) {
            val=val^arr[i];


        }
        System.out.println(val);

    }
}
