package frequent_askedprogram.java;

public class printAllPalindromUptoLimit {
    public static void main(String[] args) {
        int n=100;
        System.out.println(" the number is \n"+n );

             int num;
                  int r;
        int n2;
        for (int i = 0; i < n; i++) {
            num=i;
            n2=0;
            while(n!=0){
                r=num%10;
               n2=n2*10+r;
               num=num/10;
            }
            if(n==n2){
                System.out.println(n);
            }

        }


    }
}
