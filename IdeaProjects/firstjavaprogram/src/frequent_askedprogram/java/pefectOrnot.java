package frequent_askedprogram.java;

public class pefectOrnot {
    public static void main(String[] args) {
        // perfect number is sum of divisor
        // eg  24= 1+2+3+4+6+8+12
        int sum=0;
        int n=24;
        for (int i = 1; i < n/2; i++) {
            if (n % i == 0)
                sum = sum + i;
        }
            if(sum==n){
                System.out.println("the number is perfect ");
            }else {
                System.out.println("the number is  not perfect ");



        }
    }
}
