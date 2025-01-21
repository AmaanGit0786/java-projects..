package STacks;
import java.util.Stack;

public class basicsOfstacks {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        System.out.println(st.isEmpty());
        st.push(50);
        st.push(60);
        st.push(70);
        st.push(80);
        st.push(90);
        st.push(10);
        st.push(20);
        System.out.println(st);
        System.out.println(st.peek());
        st.pop();
        st.pop();
        st.pop();
        System.out.println(st);
        while(st.size()>1)//to access first element
        {
            st.pop();
        }
        System.out.println(st);
        System.out.println(st.isEmpty());

    }
}
