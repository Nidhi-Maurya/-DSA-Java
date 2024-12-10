package LinkedList.InterviewQuestion;

public class nthNodeFromEnd {

  public static Node nthNode(Node head,int n){
    int size=0;
    Node temp=head;
    while(temp!=null){
      size++;
      temp=temp.next;
    }

    int m=size-n+1;
    //mth node from start;;
    temp=head;
    for(int i=1;i<=m-1;i++){
 temp=temp.next;
    }
   return temp;
  }
// IN ONE TRAVERSEL CODE 
// TIME COMPLEXITY O(n)
//it also know as rabbit method.
  public static Node nthNode2(Node head,int n){
    Node slow=head;
    Node fast=head;
    for(int i=1;i<=n;i++){
      fast =fast.next;
    }
    while(fast!=null){
      slow=slow.next;
      fast=fast.next;
    }
    return slow;
  }

// delete nthnde from nth
public static Node deleteNthFromEnd (Node head, int n){
  Node slow=head;
  Node fast=head;
  for(int i=1;i<=n;i++){
    fast=fast.next;
  }
  if(fast==null){
    head=head.next;
    return head; 
  }
  while(fast.next!=null){
    slow=slow.next;
    fast=fast.next;
  }
  slow.next=slow.next.next;
  return head;
}
// display method;
public static void display(Node head){
  Node temp=head;
  while(temp!=null){
    System.out.print(temp.data+" ");
    temp=temp.next;
  }
  System.out.println();
}

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
    
    a.next=b;//  5-> 9 8 7 2 4
   b.next=c;//5 ->9 ->8 7 2 4
   c.next=d; // 5->9-> 8->7 2 4
   d.next=e;// 5->9->8-> 7-> 2 4
   e.next=f;// 5->9->8-> 7-> 2->4

  //  Node t=nthNode2(a,3);
  //  System.out.println(t.data);
display(a);
a=deleteNthFromEnd(a, 6 );
display(a);
  }
  
}
