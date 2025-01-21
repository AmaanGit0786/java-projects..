package oopsConcept;

public class fraction {
    public static Fraction add(Fraction f1,Fraction f2){
        int numerator=f1.num*f2.den+f2.num*f1.den;
        int denomerator=f1.den*f2.den;
        Fraction f3=new Fraction(numerator,denomerator);
        return f3;
    }
    public static Fraction mul(Fraction f1,Fraction f2){
        int numerator=f1.num*f2.num;
        int denomerator=f1.den*f2.den;
        Fraction f4=new Fraction(numerator,denomerator);
        return f4;
    }
    public static int gcd(int num, int den) {
        int min=Math.min(num,den);
        for(int i=min;i>=1;i--){
            if(num%i==0&&den%i==0)
                return i;
        }
        return min;
    }
    public static class Fraction{
        int num;
        int den;
        public Fraction( int num,
        int den){
            this .num= num;
            this .den=den;
            simplyfy();

        }
        public void simplyfy(){
            int hcf=gcd(num,den);
            num=num/hcf;
            den=den/hcf;

        }

    }
    public static void main(String[] args) {
        Fraction f1=new Fraction(21,7);

        System.out.println(f1.num+"/"+f1.den);
        Fraction f2=new Fraction(40,8);

        System.out.println(f2.num+"/"+f2.den);
        Fraction f3=add(f1,f2);
        System.out.println(f3.num+"/ "+f3.den);
        Fraction f4=mul(f1,f2);
        System.out.println(f4.num+"/ "+f4.den);



    }
}
