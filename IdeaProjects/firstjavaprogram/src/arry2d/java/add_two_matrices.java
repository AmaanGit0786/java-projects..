package arry2d.java;

public class add_two_matrices {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{1,2,3},{4,5,6},{7,8,9}};
        int m=a.length;
        int n=b[0].length;
        int res[][]=new int[m][n];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j]=a[i][j]+b[i][j];
                System.out.print(res[i][j]+" ");

            }
            System.out.println();

                }




        }



    }


