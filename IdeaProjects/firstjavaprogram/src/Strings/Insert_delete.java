package Strings;

public class Insert_delete {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Amaaaaaaaaan");
        /*System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb);
        System.out.println( sb.charAt(3));

        //in range we can use delete onlyin placa of deleteCharAt....IIImp;
        sb.delete(3,10);
        System.out.println(sb);*/
        sb.insert(2,"lallu");
        System.out.println(sb);

    }
}
