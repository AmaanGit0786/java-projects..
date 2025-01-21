package reccurs_ion;

public class function_call {
    public static void mango() {
        System.out.println("i am in mango function now");
        //apple();

    }
    public static void apple() {
        mango();
        System.out.println("hell0 i  am in apple method");


    }
    public static void main(String[] args) {
        System.out.println("hello my self Amaan and i am in main mathiod now");
        apple();
        System.out.println("hello my self Amaan and i am in main mathiod again");
    }
}
