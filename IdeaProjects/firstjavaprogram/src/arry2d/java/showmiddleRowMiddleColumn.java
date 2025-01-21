package arry2d.java;

public class showmiddleRowMiddleColumn {
    public static void main(String[] args) {
        int[][] arr = {{1, 3, 2,}, {4, 5, 6}, {9, 0, 8}};
        for (int i = 0; i < arr.length; i++) {
                       for (int j = 0; j < arr[0].length; j++) {
                // System.out.println("sum of first"+i);


                            if(i==2||j==2)
                             System.out.print(arr[i][j]+" ");
                           else
                               System.out.print(" "+" ");

            }

            System.out.println( );


        }
    }
}
