package Array;

public class passbyreferance {
    public static void main(String[] args) {
        int []arr={23,45,67,85};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);


    }
    public static void change(int []arr) {
        arr[0]=90;
    }
}
