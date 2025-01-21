package reccurs_ion;

public class String_transvwersal {
    public static void skip( int i ,String s ,String ans) {

        if(i==s.length()) {
            System.out.print(ans);
            return;
        }
        //return;
       // print(i+1,s);
        //occurance of a is removed
        if(s.charAt(i)!='A')
             ans=ans+s.charAt(i);
        skip(i+1,s,ans);



    }
    public static void main(String[] args) {
        String s="MOHD AMAAN";
        skip(0,s,"");

    }
}
