package Linked_list;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
class SLL {
    Node head;
    Node tail;
int size;
    void insertAtend(int val) {
        Node temp = new Node(val);
        if (head == null)
            head = tail = temp;
         else {
            tail.next = temp;
            tail = temp;
        }
         size++;

    }
    void insertAthead(int val) {
        Node temp = new Node(val);
        if (head == null)
            head = tail = temp;
        else {
            temp.next=head;
            head=temp;
        }
        size++;
    }
    void insert(int idx,int val) {
        Node temp = new Node(val);
        Node x=head;
        for (int i = 0; i < idx; i++) {
            x=x.next;

        }
        temp.next=x.next;
        x.next=temp;
        size++;
    }
    int get (int idx) {
        if (idx == size - 1) return tail.val;
        if (idx >= size || idx < 0) {
            return -1;
        }
Node temp=head;
        for (int i = 0; i <= idx; i++) {
            temp=temp.next;
        }
        return temp.val;
    }
    void DeleteAthead(){
        if(head==null)
            head=head.next;
       size--;
    }
    void delete(int idx){
        if(head==null)
            System.out.println("null value");
        if(idx<0||idx>=size)
            System.out.println("exception");
        Node temp =head;
        for (int i = 0; i < idx; i++) {
            temp=temp.next;

        }
        temp.next=temp.next.next;
        size --;
    }
        void display() {
            Node temp = head;


        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }}
public class newJavClassLLMIMPLimentation {

        public static void main(String[] args) {
        SLL ll=new SLL();
        ll.insertAtend(10);
            ll.insertAtend(20);
            ll.insertAtend(30);
            ll.insertAtend(40);
            ll.insertAtend(50);
           ll. get ( 3);
           ll.display();
           ll. DeleteAthead();
           ll. delete(7);
           ll.display();
            /*System.out.println(ll.size);
            ll.insertAtend(786);
            ll.display();
            System.out.println(ll.size);
            ll.insertAthead(14);
            //System.out.println();
            ll.display();
           ll. insert(3,4);
            ll.display();*/
    }
}
