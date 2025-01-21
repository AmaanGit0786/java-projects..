package methods;
import java.util.Scanner;

public class circumference {
    public static int calculateCircum(int r) {
        int c  = 2*22/7*r;
        System.out.println("the value of circumference of circle are as follows \n"+c);
        return c;


    }


        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=calculateCircum( r);

    }
}
