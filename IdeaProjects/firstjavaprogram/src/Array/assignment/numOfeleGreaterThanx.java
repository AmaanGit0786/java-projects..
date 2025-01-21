package Array.assignment;
import java.util.Scanner;

public class numOfeleGreaterThanx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x=sc.nextInt();
        int count=0;
        int arr[]={1,2,3,4,5,6,7,8};
        for (int i=1;i<arr.length;i++){

            if(x<arr[i])
                count++;
        }
        System.out.println("The number of eklement greater than x are as follows \n"+count);
    }
}
