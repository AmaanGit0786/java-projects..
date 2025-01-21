package STacks;
import java.util.*;

public class Stack_as_a_array {
    public static class Stack {
        private int arr[] = new int[5];
        private int idx = 0;
        void push(int x){
            arr[idx]=x;
            idx++;
            }
            void pop(){
            if(idx==0)
                System.out.println("empty");
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            }
            int peek(){
            if(idx==0) {
                System.out.println("stack is khali");
                return -1;
            }
                return idx-1;
        }
        void display(){
            for (int i = 0; i < idx-1; i++) {
                System.out.println(arr[i]+" ");
            }

        }
        int size() {
            return idx;

        }
        boolean isFull(){
            if(arr.length==idx)
                return true;
                return false;
            }
    }
    public static void main(String[] args) {
        Stack  st= new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.peek());
        //display(st);
        System.out.println(st.size());
       st.display();
      // st.push(60);
       // st.display();

    }
}
