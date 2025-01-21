package STacks;
import java.util.*;

public class reverseStack {
    public static void main(String[] args) {
        Stack <Integer> st_orignal=new Stack <>();
        st_orignal.push(20);
        st_orignal.push(30);
        st_orignal.push(40);
        st_orignal.push(50);
        st_orignal.push(60);
        System.out.println("set of original element in the stack");
        System.out.println(st_orignal);
        Stack <Integer> st_reverse =new Stack <>();
        while(!st_orignal.isEmpty()){
            st_reverse.push(st_orignal.pop());

        }
        System.out.println("set of original element in the stack in reverse form");
        System.out.println(st_reverse);
    }
}
