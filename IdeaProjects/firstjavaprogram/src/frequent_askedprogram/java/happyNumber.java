package frequent_askedprogram.java;

public class happyNumber {
    public static void main(String[] args) {
        int n = 320;
        int sum ;
        do {
sum=0;

            while (n != 0) {
                int i = n % 10;
                sum = sum + i * i;
                n = n / 10;
            }
            System.out.println(sum);
            if(sum>=10)
                n=sum;
        }while(n>=10);
        if(sum==1)
            System.out.println("happy number");
        else
            System.out.println(" not a happy number");

    }
}
