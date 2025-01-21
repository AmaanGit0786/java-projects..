package oopsConcept;

public class Student {
    public static  class student{
        String name;
        int rno;
        double percent;
    }
    public static void fun(student w){
        System.out.println(w.name);
        System.out.println(w.rno);
        System.out.println(w.percent);
        return;

    }
    public static void main(String[] args) {
        student w = new student();
        w.name = "raghav";
        w.rno=120;
        w.percent=96.1;
        //System.out.println(w.percent);// CLASSES ARE PASS BY REFERANCE;
        fun(w);

    }
}
