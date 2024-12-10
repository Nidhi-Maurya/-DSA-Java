package LinkedList;

public class basicll {
// recursive function display linkedlist
  public static void displayR(Node head){
    if(head==null) return;
    System.out.print(head.data+" ");
    displayR(head.next);
  }
//display linked list
  public static void display(Node head){
             Node temp=head;
             while(temp!=null){
              System.out.print(temp.data+" ");
                  temp=temp.next;
             }
             
  } 
// length function for finding length
  public static int length(Node head){
    int count=0;
    while(head!=null){
    count++;
          head=head.next;
     }
     return count;
  }

  // Node 
  public static class Node{
    int data;//value
    Node next;//address of next node
// constructor
    Node(int data){
      this.data=data;
    }
  }
  // Main function
  public static void main(String[] args) {
    Node a=new Node (5);
   // System.out.println(a.next);//null
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
      //    Node temp=a;
      // while(temp!=null){//printing the list
      //   System.out.print(temp.data+" ");
      //   temp= temp.next;
      // }

      // display(a);
      // System.out.println();
      //     displayR(a);
      System.out.println(length(a));
  }
}
