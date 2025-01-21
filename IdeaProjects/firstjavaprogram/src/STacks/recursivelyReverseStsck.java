package STacks;
import java.util.*;

public class recursivelyReverseStsck {
    public static void printRecursively(Stack <Integer> st) {
        if(st.isEmpty())
            return;
        int top=st.pop();
        System.out.println(top);//reverse
        printRecursively( st);
        System.out.println(top);//same


        st.push(top);
    }

    public static void main(String[] args) {
        Stack <Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println("Original");
        System.out.println(st);
        System.out.println("reverse");
        printRecursively( st);
       // System.out.println("reverse");
       // System.out.println(st);

    }
}
