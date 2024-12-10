package STACKS;

import java.util.Stack;

public class reverseStack {
  public static void pushAtBottom(Stack<Integer>st , int x){
    if(st.size()==0) {
      st.push(x);
      return;
    }
    int top=st.pop();
    pushAtBottom(st, x);
    st.push(top);
  }

  public static void reverse(Stack<Integer>st){
    if(st.size()==1) return;
    int top=st.pop();
    reverse(st);
    pushAtBottom(st,top);
  }
   public static void main(String[] args) {
    Stack<Integer> st= new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);

    /// RECURSION METHOD

    System.out.println(st);
    reverse(st);
    System.out.println(st);



    //+++++  ITERATIVE METHOD +++++++++
//     System.out.println( "initial value ="+st);
//     Stack<Integer> rt= new Stack<>();
//     while(st.size()>0){
//       rt.push(st.pop());
//     }
// System.out.println("rt value =" +rt);
//     Stack<Integer> t=new Stack<>();
//     while(rt.size()>0){
//       t.push(rt.pop());   
//     }
//     System.out.println("t value =" +t);
//     while(t.size()>0){
//       st.push(t.pop());   
//     }
//     System.out.println("againe st value "+st);

}
}
