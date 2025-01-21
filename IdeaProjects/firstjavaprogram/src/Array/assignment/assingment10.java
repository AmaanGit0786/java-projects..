package Array.assignment;

public class assingment10 {
    public static void main(String[] args) {
        int arr[] = {2, 1, 4, 3, 6, 5, 8, 7, 10, 9};
        int n = arr.length;
        int even_calculation;
        int odd_calculation;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                even_calculation = arr[i] + 10;


                System.out.print(even_calculation+"   ");
            } else{
                odd_calculation=arr[i]+20;
                System.out.println(odd_calculation);





            }


        }
    }}
