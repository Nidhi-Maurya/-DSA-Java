package STACKS;

public class LLImplementation {
  public static class Node{// user defined data type
    int val;
    Node next; 
    Node(int val){
      this.val=val;
    }

  }
  public static class LLStack{//user defined data structured
               private  Node head=null;
                private int size=0;
                //push function
                 void push(int x){
                  Node temp=new Node(x);
                  temp.next=head;
                  head=temp;
                  size++;
                 }
                 // pop function
                 int pop(){
                  if(head== null){
                    System.out.println("Stack is empty!");
                    return -1;
                  }
                  int x=head.val;
                  head=head.next;
                  return x;
                }
// peek function
                int peek(){
                  if(head== null){
                    System.out.println("Stack is empty!");
                    return -1;
                  }
                  return head.val;
                }

                // display function

                void displayrec(Node H){
                  if(H==null) return;
                  displayrec(H.next);
                  System.out.print(H.val+" ");
                }
                void display(){
                    displayrec(head);
                    System.out.println();
                }
                // reverse display
                void  displayreverse(){
                  Node temp=head;
                  while(temp!=null){
                    System.out.print(temp.val+" ");
                    temp=temp.next;
                  }
                  System.out.println();
                }
                // size function
                int size(){// getter
                  return size;
                }
                // empty function
                boolean isEmpty(){
                  if(size==0) return true;

                  return false;

                }
               
  }
  public static void main(String[] args) {
    LLStack st=new LLStack();
    st.push(4);
    st.display();//4
    st.push(5);
    st.display();// 4 5
    st.push(1);
    st.display();//4,5,1
    System.out.println(st.size());//3
    st.pop();
    st.display(); // 4,5
    System.out.println(st.size()); //2
    st.push(2);//4 5 2
    st.push(8);// 4 5 2 8
    st.push(7); // 4 5 2 8 7
  
   
  
  }
  
}
