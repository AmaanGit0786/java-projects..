package arry2d.java;

public class printrnoOfSrudents {
    public static void main(String[] args) {
        int [][]arr={{1,99},{2,95},{3,97},{9,98}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }

            System.out.println();
        }
    }
}
