package STacks;
import java.util.*;

public class insertElementOnParticularIndex {
    public static void main(String[] args) {
        Stack <Integer> st_orignal=new Stack <>();
        st_orignal.push(20);
        st_orignal.push(30);
        st_orignal.push(40);
        st_orignal.push(50);
        st_orignal.push(60);
        System.out.println("set of original element in the stack");
        System.out.println(st_orignal);
        int new_element=786;
        int pos=2;
        Stack <Integer> st_temp =new Stack <>();
        while(st_orignal.size()>=pos){
            st_temp.push(st_orignal.pop());

        }
        st_orignal.push(new_element);
        while(!st_temp.isEmpty()) {
            st_orignal.push(st_temp.pop());
        }
        System.out.println("set of original element in the stack insert element on thre  bottom");
        System.out.println(st_orignal);
    }
}
