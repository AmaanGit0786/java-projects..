package frequent_askedprogram.java;
import java.util.Scanner;
public class MissingElementReturnLength {
    public static void main(String[] args) {
        int [] arr = {2,2,3,4,4,4,6,6,6,6,7};
        int n = arr.length;
        int count =1;
        for (int i = 1; i < n; i++) {

            if (arr[i] != arr[i-1]){

                arr[count] = arr[i];
                count++;
            }
        }
        System.out.println(count);

        for (int i = 0; i < count; i++) {

            System.out.print(arr[i]+" ");
        }
        }
    }

