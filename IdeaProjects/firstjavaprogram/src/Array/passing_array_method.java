package Array;

public class passing_array_method {
    public static void main(String[] args) {
        int x=5;
        System.out.println(x);  //pass by value
        change(x);
        System.out.println(x);
    }
    public static void change(int x) {
        x=10;
    }

}
