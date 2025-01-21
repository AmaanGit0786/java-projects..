package arry2d.java;

public class waveform {
    public static void print(int [][]arr) {
        int n=arr.length;
        int m=arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();

        }
        System.out.println();


    }

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3,4}, { 5, 6,7,8}, {9, 10,11,12,13},{14,15,16,17}};
        print(arr);
        //waveform
        System.out.println("after wave form");
       // int m = arr.length;
      //  int n = arr[0].length;
        for (int i = 0; i < 4; i++) {
            if (i % 2 == 0) {

                for (int j = 0; j < 4; j++) {
                    System.out.print(arr[i][j]+" ");
                }


                }else{
                    for (int j = 4 - 1; j >=0; j--) {
                        System.out.print(arr[i][j] + " ");

                    }

                }
                System.out.println();

            }

        }
    }
