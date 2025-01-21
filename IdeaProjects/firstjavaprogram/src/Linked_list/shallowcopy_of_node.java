package Linked_list;

public class shallowcopy_of_node {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

       // Node a=new Node(100);
        Node temp =a;//shallow copy {it print the same address
       // System.out.println(a.val+"\n"+temp.val);
      //  System.out.println(a+"\n"+temp);
        Node tem= new Node (100);// deep cpy {it print the different address
        //System.out.println(a.val+"\n"+tem.val);
         System.out.println(tem);
while(temp!=null){
    System.out.println(temp.val);
    temp=temp.next;
} System.out.println();

    }
}
