package LinkedList;

public class doubleylinkedlist {
  public static class Node{
    int val;
    Node next;
    Node prev;
    Node(int val){
      this.val=val;
    }
  }
// display dll
  public static void displayAll(Node head){
    Node temp=head;
    while(temp!=null){
      System.out.print(temp.val+" ");
      temp=temp.next;
    }
System.out.println();
  }
  //display reverse DLL
  public static void displayAllReverse(Node tail){
   Node temp=tail;
   while(temp!=null){
    System.out.print(temp.val+" ");
    temp=temp.prev;
   }
   System.out.println();
  }
  public static void displayrandom(Node random){// 
    Node temp=random;
    // move this temp backword to the head;
    while(temp.prev!=null){
      temp=temp.prev;
    }
    // now temp is at head;
    //print list
    while(temp!=null){
      System.out.print(temp.val+" ");
      temp=temp.next;
     }
     System.out.println();

  }
  // insert at head in dlll
  public static Node insertAtHead(Node head , int x ){
    Node t=new Node(11);
    t.next=head;
    head.prev=t;
    return t;
  }

  // insertion at tail node if head is given
   public static  void insertAtTail(Node head, int x){
    Node temp=head;
    // temp ko tail tk le kr jate h
    while(temp.next!=null){
      temp=temp.next;
      temp=temp.next;
    }
    Node t=new Node(x);
    temp.next=t;
    t.prev=temp;
   }
   // insert list  at any index in dll

   public static void insertAtIdx(Node head,int idx,int x){
    Node s=head;
    for(int i=1;i<=idx-1;i++){
      s=s.next;
    }
    // s is at idx-1 position
    Node r=s.next; // idx
    Node t=new Node(x);
    s.next=t;
    t.prev=s;
    t.next=r;
    r.prev=t;
   }

  // Delete at head
  public static void deleteAt(Node head,int idx){
    Node temp=head;
    while(temp.next!=null){
      temp=temp.prev;
     // temp.next=null;
    }
  }
  public static void main(String[] args) {
    // 4 5  7 6 9
    Node a=new Node(4);
    Node b=new Node(5);
    Node c=new Node(7);
    Node d=new Node(6);
    Node e=new Node(9);
    a.prev=null;
    a.next=b;
    b.prev=a;
    b.next=c;
    c.prev=b;
    c.next=d;
    d.prev=c;
    d.next=e;
    e.prev=d;
    e.next=null;
     displayAll(a);
    // displayAllReverse(e);
    //displayrandom(c);
    // Node newHead=insertAtHead(a,35);
    // displayAll(newHead);
    insertAtTail(a,90);
    displayAll(a);
    insertAtIdx(a,3,56);
    displayAll(a);
    deleteAt(a, 6);
    displayAll(a);
  }

  
}
