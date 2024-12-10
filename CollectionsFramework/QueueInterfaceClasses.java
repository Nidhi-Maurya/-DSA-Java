
import java.util.*;
 

public class QueueInterfaceClasses {
//  DEQUE


static void DequeExample(){
  ArrayDeque<Integer> dq= new ArrayDeque<>();
  dq.addFirst(1);
  dq.addFirst(2);
  dq.addLast(3);
  dq.addLast(4);
  System.out.println(dq);//2,1,3,4
  System.out.println(dq.peekFirst());//2
  System.out.println(dq.peekLast());//4
  System.out.println(dq.pollFirst());//2
  System.out.println(dq.pollLast());//2
  System.out.println(dq);//1,3



}

  ///PRIORITY QUEUE
 static void PriorityQueueExample(){
  PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder() );
  pq.add(10);
  pq.add(5);
  pq.add(7);

  System.out.println(pq.peek());//5 the smallest element has highest priority queue

  // in queue interface  peek () is use for top position vaulue which priority is high
  // polll() function is used used to delete the element

  // Comparator.reverseOrder() function is used to make highest value to hightest priority 
  
  
  System.out.println(pq.peek());//5

  System.out.println(pq);//5,10,7

  System.out.println(pq.poll());//5
  System.out.println(pq); //10,7
  
  System.out.println(pq.peek()); //7


 }
















  static void QueueExamples(){
         LinkedList<Integer> q=new LinkedList<>();
q.offer(1);
q.offer(2);
q.offer(3);
System.out.println(q.peek());//1
System.out.println(q.poll());//1 - will also remove
System.out.println(q.peek());// 2
System.out.println(q.isEmpty());// false
System.out.println(q.size());// 2

System.out.println(q);
  }

  public static void main(String[] args){
           // QueueExamples();
          // PriorityQueueExample();

          DequeExample();
  }



}
