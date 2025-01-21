package QUeue;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseKelementQueue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
       int n=sc.nextInt();
       // int s=sc.nextInt();
        Queue<Integer> que=new LinkedList<>();
        // System.out.println(que.isEmpty());
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        System.out.println(que);
        Stack<Integer> st=new Stack<>();

        while(k-->0){
            int ele= que.remove();
            st.push(ele);
        }
        System.out.println("element present in 33 the stack");
        System.out.println(st);
        while(!st.isEmpty()){
            int ele2= st.pop();
            que.add(ele2);
        }

        System.out.println("element present in the que 33 in the reverse order");
        System.out.println(que);
        //  System.out.println();
        // Queue<Integer> reque=new LinkedList<>();
        while(n-->0){
            int ele= que.remove();
            st.push(ele);

        }
        System.out.println("element present in 33 the stack");
        System.out.println(st);
        Stack<Integer> st2=new Stack<>();
        while(!st.isEmpty()){
            st.push(st.pop());
        }
        System.out.println("final");
        System.out.println(st2);
        while(!st.isEmpty()){
            int ele2= st.pop();
            que.add(ele2);
        }
        System.out.println(st);
        System.out.println("element present in the que final in the reverse order");
        System.out.println(que);
        //  System.out.println();
        // Queue<Integer> reque=new LinkedList<>();


    }
}



