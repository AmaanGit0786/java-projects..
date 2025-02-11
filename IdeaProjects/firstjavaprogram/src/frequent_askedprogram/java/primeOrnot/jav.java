package frequent_askedprogram.java.primeOrnot;

public class jav {
    public static void main(String[] args) {
        // number is prime or not;
        int count;
        int n = 25;
        for (int i = 2; i <= n; i++) {
            count = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) { // count =0 means above number is prime number;
                double val = Math.pow(2, i) - 1;
                for (int j = 2; j <= val / 2; j++) {
                    if (val % j == 0) {
                        count++;
                        break;
                    }
                }
if(count ==0)
    System.out.println(val);
            }

        }
    }}
