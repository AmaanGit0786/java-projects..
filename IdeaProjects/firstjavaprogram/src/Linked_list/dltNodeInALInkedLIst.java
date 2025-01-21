package Linked_list;
class deleteNode {
    Node head;
    Node tail;

    void display() {
        Node temp = head;


        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public class dltNodeInALInkedLIst {
        public static void main(String[] args) {
            deleteNode dn=new deleteNode();

            Node a = new Node(10);
            Node b = new Node(20);
            Node c = new Node(30);
            Node d = new Node(40);
            Node e = new Node(50);
            dn.display();


        }
    }
}
