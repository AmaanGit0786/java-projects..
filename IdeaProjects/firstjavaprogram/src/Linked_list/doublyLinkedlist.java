package Linked_list;
class dNode{
    int val;
    dNode next;
    dNode prev;
    dNode(int val){
        this.val=val;

    }

        }
        class dll{
    dNode head;
    dNode tail;
    int size;
    void display(){
        dNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;

        }
        System.out.println();
    }
    void insertionAtTail(int val){
        dNode temp= new dNode(val);
        if(size==0) {
            head = tail = temp;
        }
        else {
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
        }
        size++;

    }
            void insertionAthead(int val){
                dNode temp= new dNode(val);
                if(size==0) {
                    head = tail = temp;
                }
                else {
                    head.prev=temp;
                    temp.next=head;
                    head=temp;
                }
                size++;

            }
            void insertionAtIndex(int val){
                dNode temp= new dNode(val);
                if(size==0) {
                    head = tail = temp;
                }
                else {
                    head.prev=temp;
                    temp.next=head;
                    head=temp;
                }
                size++;

            }
        }

public class doublyLinkedlist {
    public static void print(dNode head) {
        dNode temp=head;
      while(temp!=null){
          System.out.print(temp.val);
          temp=temp.next;

        }
        System.out.println();


    }
    public static void printreverse(dNode tail) {
        dNode temp=tail;
        while(temp!=null){
            System.out.print(temp.val);
            temp=temp.prev;

        }
        System.out.println();


    }

    public static void main(String[] args) {
        dll l=new dll();
        l.insertionAtTail(10);
        l.display();
        l.insertionAtTail(20);
        l.insertionAtTail(30);
        l.insertionAtTail(40);
        l.insertionAtTail(50);
        l.display();
        System.out.println("Size of the linked list");
        System.out.println(l.size);
        l.insertionAthead(14);
        l.display();
    }
}
