package QUeue;

public class dequeImplementation {
    static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
            this.prev=this.next=null;

        }
    }
static class deque{
        Node front;
        Node rear;
        int size;
        deque(){
            front=rear=null;
            size = 0;
        }
        boolean isEmpty(){
            if(size==0)
                return true;
            return false;
        }
        int size(){
            return size;
        }
        void insertFront( int val){
            Node newNode = new Node(val);
            if(front==null) {
                rear = front = newNode;
            }else{
                newNode.next=front;
                front.prev=newNode;
                front =newNode;

            }
            size++;
        }
        void deletefront () {
            if (front == null) {
                System.out.println("queue is empty");
            } else {
                Node temp = front;
                front = front.next;
            }
            if (front == null) {
                rear = null;
            } else {

                front.prev = null;
            }
            size-- ;
        }
        void deleterear(){
            Node temp=null;
            rear=rear.prev;
            if(rear==null) {
                front = null;
            }else{
                rear.next=null;
            }
            size--;

        }
        int getFront(){
            if(size==0){
                System.out.println("underflow condition");
                return -1;

            }else{
                return front.val;
            }
        }
    int getrear(){
        if(size==0){
            System.out.println("underflow condition");
            return -1;

        }else{
            return rear.val;
        }
    }


}


    public static void main(String[] args) {
         deque d = new deque();
        d.insertFront(10);
        d.insertFront(120);
        d.insertFront(130);
        System.out.println(d.getFront());
        d.deletefront();
        System.out.println(d.getFront());
        d.deletefront();
        System.out.println(d.getFront());

    }
}
