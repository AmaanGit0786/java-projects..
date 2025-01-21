package methods;
import java.util.Scanner;

public class radius_of_circle {
    public static void calculateArea( double  r) {
        double area = 3.14 * r * r;
        System.out.println(area);


    }

        public static void main(String[] args) {
        Scanner scx =new Scanner(System.in);
        System.out.println("Enter the value of radius");
        double r=scx.nextInt();
          calculateArea(r);




    }




    }

