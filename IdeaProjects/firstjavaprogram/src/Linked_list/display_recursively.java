package Linked_list;

public class display_recursively {
    public static void displayRecursivly(Node head){
        if(head==null)
            return;


        System.out.println(head.val);
        displayRecursivly(head.next);
       // System.out.println(head.next);



    }
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
        displayRecursivly(a);
        System.out.println();

    }
}
