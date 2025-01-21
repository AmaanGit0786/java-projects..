package QUeue;
import java.util.*;

public class BasicsOPeration {
    public static void main(String[] args) {
        Queue<Integer> que=new LinkedList<>();
       // System.out.println(que.isEmpty());
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        System.out.println(que);
        que.remove();
        System.out.println(que);
        System.out.println(que.size());
        System.out.println(que.isEmpty());
    }
}
