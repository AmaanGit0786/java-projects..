package Strings;

public class Addition {
    public static void main(String[] args) {
        String first_name= "MOHD";
        String last_name="AMAAN";
        String ful_name= first_name + " "+ last_name;
        System.out.println(ful_name.length());
        //Char at
        for (int i = 0; i < ful_name.length(); i++) {
            System.out.print(ful_name.charAt(i));

        }

    }
}
