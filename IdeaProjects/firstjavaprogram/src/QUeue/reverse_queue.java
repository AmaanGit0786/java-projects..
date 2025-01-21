package QUeue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class reverse_queue {
    public static void main(String[] args) {
        Queue<Integer> que=new LinkedList<>();
        // System.out.println(que.isEmpty());
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        System.out.println(que);
        Stack<Integer> st=new Stack<>();
        while(!que.isEmpty()){
            int ele= que.remove();
            st.push(ele);
        }
        System.out.println("element present in the stack");
        System.out.println(st);
        while(!st.isEmpty()){
            int ele2= st.pop();
            que.add(ele2);
        }
        System.out.println("element present in the que in teh reverse order");
        System.out.println(que);
      //  System.out.println();
       // Queue<Integer> reque=new LinkedList<>();


    }
}
