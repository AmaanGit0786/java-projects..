package reccurs_ion;
import java.util.ArrayList;

public class subset {
    static ArrayList<String> arr= new ArrayList<String>();
    public static void  print( int i,String s,String ans){
        if(i== s.length()){
       arr.add(ans);
            return;
        }
char ch=s.charAt(i);
        print(i+1,s,ans);
        print(i+1,s,ans+ch);

    }
    public static void main(String[] args) {
        String s="abc";
        print(0,s,"");
        System.out.println(arr);
    }
}
