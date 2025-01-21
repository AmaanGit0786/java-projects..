package arry2d.java;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class arraylist_2d {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        List<Integer> b = new ArrayList<>();
        b.add(10);
        b.add(20);
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        d.add(60);
        d.add(70);
        d.add(80);
        List<List<Integer>> l = new ArrayList<>();
        l.add(a);
        l.add(b);
        l.add(c);
        l.add(d);
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));

        }
        System.out.println(l.get(3).get(2));

    }
}
