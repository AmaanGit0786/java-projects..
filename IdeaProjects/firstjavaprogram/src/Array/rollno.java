package Array;

public class rollno {
    public static void main(String[] args) {
        int[]arr={4,87,98,65,45,32,23,12,11};
        for (int i=0;i<arr.length;i++){
            if (arr[i]<35)
                System.out.println(i);
            else System.out.println("passed");
        }
    }
}
