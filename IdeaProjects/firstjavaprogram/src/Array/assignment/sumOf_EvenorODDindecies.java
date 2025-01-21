package Array.assignment;
import java.util.Scanner;

public class sumOf_EvenorODDindecies {
    public static void main(String[] args) {
        int arr[] = {22, 33, 55, 44, 66, 88, 77, 99};
        int n = arr.length;
        int sum = 0;
        int sum2=0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                sum = sum + arr[i];
            else
                 sum2=sum2+arr[i];


        }
        System.out.println("the sum of even indecies are as follows " + sum);

        System.out.println("the sum of odd indecies are as follows " + sum2);
        }

    }
