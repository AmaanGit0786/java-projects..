package QUeue;
import java.util.*;
public class implementationOfCircularQue {

     static class cirQue {
      int front = -1;
      int rear = -1;
      int size = 0;
      int arr[] = new int[5];
      int n=arr.length;
      public void  add(int x)
      {
          if(size==0) {
              front = rear = 0;
              arr[0] = x;
          }else if(size==n){
              System.out.println("queue is full");
              return;
          }
          else if(rear<n-1){
              arr[++rear]=x;

          }else if(rear==n-1){
              rear=0;
              arr[0]=x;
          }
       //   public void remove(){

    //  }


  }
    }
    public static void main(String[] args) {

    }
}
