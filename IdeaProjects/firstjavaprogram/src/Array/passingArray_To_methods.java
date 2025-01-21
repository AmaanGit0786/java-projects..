package Array;

public class passingArray_To_methods {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};

        for (int x:arr) {
            System.out.println(x);
        }
    }

     static int printModifiedNumber(int[] num) {
        for (int i = 0; i <= num.length; i++) {
            num[i] = num[i] * 2;


        }
        return 0;
    }
}

