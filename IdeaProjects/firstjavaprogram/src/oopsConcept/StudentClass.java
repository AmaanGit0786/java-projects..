package oopsConcept;

public class StudentClass {

    public static class Student {
        String name;
        int rno;
        double percent;

        public Student(String naam ,int roll,double per) {
            name=naam;// CONSTRUCTOR
            rno=roll;
            percent=per;

        }

        public static void main(String[] args) {
            System.out.println("amaan's Information");
            Student s1=new Student("amaan",31 ,96.2 );
            System.out.println(s1.name);
            System.out.println(s1.rno);
            System.out.println(s1.percent);
            System.out.println("hitender's Information");
            Student s2=new Student("hitender",21 ,99.2 );
            System.out.println("naam="+s2.name);
            System.out.println("roll no.="+s2.rno);
            System.out.println("pratisat="+s2.percent);

        }
    }
}