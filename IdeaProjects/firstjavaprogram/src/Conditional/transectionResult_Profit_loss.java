package Conditional;
import java.util.Scanner;

public class transectionResult_Profit_loss {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of cost price");
        int cp=sc.nextInt();
        System.out.println("enter the value of sell price");
        int sp=sc.nextInt();
        if(cp>sp) {


            int loss=cp-sp;
            System.out.println("here we face loss and the amount of loss are as given below"
                    + loss);
        } else if (sp>cp) {

            int profit = sp - cp;

            System.out.println("here we gain profit and the amount of profit are as given below"
                   +"  " + profit);

        }


    }
}
