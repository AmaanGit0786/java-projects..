package methods;
import java.util.Scanner;



public class threenoAvarage {
    public static int printAverage(int a,int b, int c) {

        int avg=(a+b+c)/3;
        System.out.println("the average of number are as follows");
        System.out.println(avg);
        return avg;



    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int avg=printAverage( a, b, c);




    }
}
