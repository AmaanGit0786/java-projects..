package frequent_askedprogram.java;

public class printAllPerfectNumber {
    public static void main(String[] args) {
        int n=80;
        int sum;
        for (int i = 1; i <= n; i++) {
            sum=0;
            for (int j = 1; j <=i/2 ; j++) {
                if(i%j==0)
                  sum=sum+j;
            }
            if(sum==i)
                System.out.println(i);

            }
            
        }
    }

