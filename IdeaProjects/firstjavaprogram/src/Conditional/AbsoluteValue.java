package Conditional;

public class AbsoluteValue {
    public static void printAbsolute(int n) {

        if(n<0)
            System.out.println(-n);
        else
            System.out.println(n);
    }
    public static void main(String[] args) {
        int n=30;

        printAbsolute( n);
        n=-7777;
        printAbsolute( n);
    }
}
