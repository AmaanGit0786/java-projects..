package reccurs_ion;

public class preINpost {
    public static void pip(int n) {
        if(n==0) return;
        System.out.println("pre"+n);
        pip(n-1);
        System.out.println("In"+n);
        pip(n-1);
        System.out.println("post"+n);

    }
    public static void main(String[] args) {
        pip(2);


    }
}
