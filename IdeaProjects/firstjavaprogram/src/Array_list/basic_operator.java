package Array_list;

import java.util.ArrayList;
import java.util.List;

public class basic_operator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(0, 8);
        list.add(1, 5);
        list.add(2, 9);
        System.out.println(list);
        System.out.println("the size of an array is "+list.size());
        list.remove(1);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+"   ");
        }
        System.out.println();
        list.remove(2);
        System.out.println("Now the size of an array is  "+list.size());
        System.out.println(" now the element of the array are as follows");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+"   ");



    }
        //modify
        System.out.println();
        list.set(1,30);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+"   ");
}}}