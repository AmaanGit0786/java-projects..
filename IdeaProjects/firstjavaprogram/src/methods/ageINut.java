package methods;
import java.util.Scanner;

public class ageINut {
    public static int calculateAge(int a){
        if (a>=18)
            System.out.println("he is eligible to vote");
        if(a<18)
            System.out.println("he is not eligible to vote");
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        calculateAge( a);


    }

}
