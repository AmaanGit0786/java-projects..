package NptelJAvAcourse;

public class TestArray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int n=arr.length;
        System.out.print(" The number which is present in the array are as follows :--- \n");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"\n ");
        }
        float sum=0;

        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }
        System.out.println(" The sum of element ofthe array are as follows \n");
        System.out.println(sum);
        float average= sum/n ;
        System.out.println(" The Average of elements of the array are as follows \n");
        System.out.println(average);


    }
}
