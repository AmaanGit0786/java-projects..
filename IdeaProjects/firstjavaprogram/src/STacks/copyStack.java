package STacks;
import java.util.*;

public class copyStack {
    public static void main(String[] args) {
        Stack <Integer> st_orignal=new Stack <>();
        st_orignal.push(20);
        st_orignal.push(30);
        st_orignal.push(40);
        st_orignal.push(50);
        st_orignal.push(60);
        System.out.println("set of original element in the stack");
        System.out.println(st_orignal);
        Stack <Integer> st_temp =new Stack <>();
        while(!st_orignal.isEmpty()){
            st_temp.push(st_orignal.pop());

        }
        System.out.println("set of original element in the stack in reverse form");
        System.out.println(st_temp);
        Stack <Integer> st_copy =new Stack <>();
        while(!st_temp.isEmpty()){
            st_copy.push(st_temp.pop());

        }
        System.out.println("set of original element in the stack in copy form");
        System.out.println(st_copy);

    }
}
