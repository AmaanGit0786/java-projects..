package methods;
import java.util.Scanner;

public class number_of_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in );
        System.out.println("enter the value");
        int n=sc.nextInt();
        int square=n*n;
        int count=0;
        while(n>0){
            n=n/10;
            count++;

        }

        System.out.println(count);
        System.out.println("THE SQUARE OF THE NUMBER "+n+ " ARE AS FOLLOWS\n"+square);


    }

}
