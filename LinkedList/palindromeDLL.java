package LinkedList;

public class palindromeDLL {
  public static class Node{
    int val;
    Node next;
    Node prev;
    Node(int val){
      this.val=val;
    }
  }
  public static void displayAll(Node head){
    Node temp=head;
    while(temp!=null){
      System.out.print(temp.val+" ");
      temp=temp.next;
    }
System.out.println();
  }
  // checking palindrome

  public static boolean isPalindrome(Node head,Node tail){
    Node h=head;
    Node t=null;
    while(h!=t){
      if(h.val!=t.val){
       // return false;
       System.out.println("not palindrome");
      }
        h=h.next;
        t=t.next;
    }
    System.out.println("palindrome");
    return true;
  }
  public static void main(String[] args) {
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
    // displayAll(a);
  }
  
}
