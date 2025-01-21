package Linked_list;
class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
        this.next = next;
    }
    public class List_Of_node {
        public static void main(String[] args) {
            Node a = new Node(10);
            Node b = new Node(20);
            Node c = new Node(30);
            Node d = new Node(40);
            Node e = new Node(50);

            a.val = 10;
            System.out.println(a);
            System.out.println(a.val);
            System.out.println(a.next);
           // Node b = new Node(20);
            a.next = b;// it signifies that a linked with b;
            System.out.println(b);
            System.out.println(a.next);

            //a.next.val=b.val
            System.out.println(a.val);
            System.out.println(b.val);
            System.out.println(a.next.val);

        }
    }
}