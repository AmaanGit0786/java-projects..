package Array;
import java.util.Scanner;

public class search_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr={1,2,3,4,5,6,7,8};

        for (int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
           if(arr[i]==6)
               System.out.println(i+" ");
        }
    }
}
