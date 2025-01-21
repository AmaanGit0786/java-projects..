package newLinked.java;

public class implemenetationOFLINKedLIst {
    public static class node{
        int val;
        node next;

        node(int val){
            this .val=val;

        }
    }

    public static class linkedlist {
        node head = null;
        node tail = null;
        int size;

        void insertAtEnd(int val) {
            node temp = new node(val);
            if (head == null) {
                head = temp;
            } else {

                tail.next = temp;
                size++;
            }
            tail = temp;

        }

        void insertAthead(int val) {
            node temp = new node(val);
            if (head == null) {
                head = temp;
            } else {

                temp.next = head;

            }
            head = temp;
        }

        void insert(int idx, int val) {
            node temp = new node(val);
            node x = head;
            for (int i = 0; i < idx - 1; i++) {
                x = x.next;

            }
            temp.next = x.next;
            x.next = temp;
            size++;
        }

        void delete(int idx) {
            if (head == null)
                System.out.println("0");
            if (idx < 0 || idx > size - 1)
                System.out.println("invalid index");
            node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }

        node middleNode(node head) {
            node temp=head;
            int len=0;
            while(temp!=null) {
                temp=temp.next;
                len++;
            }
            int mid=len/2+1;
            temp=head;
            for (int i = 0; i < mid-1; i++) {
                temp = temp.next;
            }
            return temp;

            }

        

        int get(int idx){
            if(idx==size-1) return tail.val;
            if(idx>size-1||idx<0) {
                System.out.println("invalid index");
                return -1;
            }

            node temp=head;
            for(int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.val;
        }
        void display(){
            node temp=head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }

        public void middleNode(int i) {
        }
       /* int size(){
            node temp =head;
            int count=0;
            while(temp!=null){
                count++;
            }
            return count;
        }
*/
    }

    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.insertAtEnd(40);
        ll.insertAtEnd(50);
        ll.display();
       // ll.insertAtEnd(60);
       // ll.insertAthead(786);
       // ll.display();
        System.out.println( ll.get(2));
       // System.out.println(ll.size());
        System.out.println(ll.size);
        ll.delete(2);
        ll.display();
        System.out.println("now the size of linked list reduced to ");
        System.out.println(ll.size);
        ll.insert(2,30);
        ll.display();
        System.out.println(ll.tail.val);
        ll.middleNode(3);


    }
}
