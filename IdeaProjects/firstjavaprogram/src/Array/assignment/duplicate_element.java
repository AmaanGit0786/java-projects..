package Array.assignment;

public class duplicate_element {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,2,3};
        int n=arr.length;
        System.out.println("the duplicate element are as follows");
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]==arr[j])
                    System.out.println(arr[i]);


            }

        }
    }
}
