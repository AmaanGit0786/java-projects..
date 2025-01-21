package Strings;

public class appendString_biuilder {
    public static void main(String[] args) {
        StringBuilder sv= new StringBuilder ("Amaan");
        System.out.println(sv);
        sv.append(23);
        System.out.println(sv);
        /* over all conclusion beides int array al are commend and we can use commend in String builder and sv+=
        "Amaan"
        char[]
 in String         */
        char[] ch={'a','d','r','y'};
        sv.append(ch);
        System.out.println(sv);

    }
}

