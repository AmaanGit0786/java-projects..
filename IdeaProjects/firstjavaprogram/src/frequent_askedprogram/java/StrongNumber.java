package frequent_askedprogram.java;


public class StrongNumber {
    public static int factorial(int num){
        int fact=1;
        for (int i = 1; i <= num; i++) {
            fact= fact*i;

        }
        return fact;

    }

    public static void main(String[] args) {
        int n=145;
        int strongNumber=n;
        int sum=0;

       while(n!=0){
           int rem= n%10;
           sum = sum+ factorial(rem);
           n=n/10;

       }
       System.out.println(sum);
       if(sum==strongNumber) {
           System.out.println("the number is  strong number");
       } else{
           System.out.println("the number is not  strong number");
    }
    }
}
