package LinkedList;

public class implimentation {
  public static class Node{
    int data ;
    Node next;
    //constructor
    Node(int data){
      this.data=data;
    }
  }
    public static class linkedlist{
          Node head=null;
          Node tail=null;
          //insert function at end 
          void insertAtEnd(int val){
            Node temp=new Node(val);
           if(head==null){
            head=temp;
           }else{
            tail.next=temp;
           }
           tail=temp;
          }
 //inserting at beggining
 void insertAtHead(int val){
  Node temp=new Node(val);
   if(head==null){//empty list
    // head=tail=temp;
    insertAtEnd(val);
   }else{// non empty list
     temp.next=head;
     head=temp;

   }
 }

 // delete function in linkedlist

 void deleteAt(int idx){
  if(idx==0){
    head=head.next;

  }
  Node temp=head;
  for(int i=1;i<=idx-1;i++){
    temp=temp.next;
  }
  temp.next=temp.next.next;
  tail=temp;
  //size--;

 }
 // insert at in any index linked list
 void insertAt(int idx,int val){
  Node t=new Node(val);
  Node temp=head;
  if(idx==size()){
    insertAtEnd(val);
    return ;
  }else if(idx==0){
    insertAtHead(val);
    return;
  }else if(idx<0  || idx>size()){
    System.out.println("wrong index");
    return;
  }
  

  for(int i=1;i<=idx-1; i++){
    temp=temp.next;
  }
  t.next=temp.next;
  temp.next=t;
 }

 // getting  value 
 int getAt(int idx){
  if(idx<0  || idx>size()){
    System.out.println("wrong index");
    return-1;
  }
  Node temp =head;
  for(int i=1;i<=idx;i++){
    temp=temp.next;
  }
  return temp.data;

 }
// display function
          void display(){
            Node temp=head;
            while(temp!=null){
              System.out.print(temp.data+" ");
              temp=temp.next;
            }
            System.out.println();
          }
          int size(){
            Node temp=head;
            int count=0;
            while(temp!=null){
            count ++;
              temp=temp.next;

            }
            return count;
          }

    }
 public static void main(String[] args) {
  linkedlist ll=new linkedlist();
  ll.insertAtEnd(4); //4
  ll.display();
  ll.insertAtEnd(5);// 4-> 5
  ll.display();
 // System.out.println(ll.size());
 ll.insertAtEnd(15);// 4->5->15
 ll.display();
 ll.insertAtHead(13);// 13->4->5->15
 ll.display();
 ll.insertAt(2,10);//13->4->4->5->15;
 ll.display();
 ll.insertAt(0,100);
 ll.display();
 //System.out.println(ll.getAt(4));
 ll.deleteAt(0);
 ll.display();
 }
 
  
}
