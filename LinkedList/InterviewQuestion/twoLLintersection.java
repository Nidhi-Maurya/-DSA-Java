package LinkedList.InterviewQuestion;

public class twoLLintersection {
//Display method
public static void display(Node head){
  Node temp=head;
  while(temp!=null){
   System.out.print(temp.data+" ");
       temp=temp.next;
  }
  
} 

// Node clss
  public static class Node{
    int data;
    Node next;
    Node(int data){
      this.data=data;
    }
  }
  public static void main(String[] args) {
    Node a=new Node (5);
     Node b=new Node (9);
     Node c=new Node (8);
     Node d=new Node (7);
     Node e=new Node (2);
     Node f=new Node (4);
    //5 9 8 7 2
    a.next=b;//  5-> 9 8 7 2
   b.next=c;//5 ->9 ->8 7 2
   c.next=d; // 5->9-> 8->7 2
   d.next=e;// 5->9->8-> 7-> 2
   e.next=f;
    display(a);
  }
  
}
