package STACKS;

import java.util.Stack;

public class displayStack {
// reverse function 
  public static void displayReverse(Stack<Integer>st){
    if(st.size()==0) return;
   int top=st.pop();
   System.out.print(top+ " ");
   displayRec(st);
   st.push(top);

  }
  public static void displayRec(Stack<Integer>st){
    if(st.size()==0) return;
   int top=st.pop();
   displayRec(st);
   st.push(top);
   System.out.print(top+ " ");

  }
   public static void main(String[] args) {
    Stack<Integer> st= new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
   // System.out.println(st);
    displayReverse(st);
    System.out.println();
    displayRec(st);
   // System.out.println(st);
   // System.out.println(st);
    // Stack<Integer> rt= new Stack<>();
    // while(st.size()>0){
    //    //int x=st.pop();
    //    rt.push(st.pop());
    // }
    // while(rt.size()>0){
    //   int x=rt.pop();
    //   System.out.print(x+" ");
    //   st.push(x);
    // }
    // System.out.println(st);

    // ARRAYS METHOD
    //  int n=st.size();
    //  int[] arr=new int[n];
    //  for(int i=n-1;i>=0;i--){
    //   arr[i]=st.pop();
    //  }
    //  for(int i=0;i<n;i++){
    //   //int x=arr[i];
    //   System.out.print(arr[i]+ " ");
    //   st.push(arr[i]);
    //  }

// REcusrsively


}
}