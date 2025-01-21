package Array_list;

public class two_sum {
    public static void main(String[] args) {

        int sum=9;
        int[]arr={5,9,0,4};
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==sum)
                    System.out.println(arr[i]+"   "+arr[j]);
                }
            System.out.println();
            }

        }
    }

