package Array.assignment;

public class numbr_elementGreaterThanX {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int x=3;
        int n=arr.length;
        int a=1;
        for (int i = 0; i < n; i++) {
            if(arr[i]>x)
                a+=1; //this question is try with the help of method...

           // System.out.println(a);


        }
       System.out.println(a);

    }
}
