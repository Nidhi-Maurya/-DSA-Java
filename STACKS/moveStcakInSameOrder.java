package STACKS;

import java.util.*;
public class moveStcakInSameOrder {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Stack<Integer> st =new Stack();
    // int n;
    // System.out.println("enter the number of element: ");
    // n=sc.nextInt();
    // System.out.println("enter the elements : ");
    // for(int i=1;i<=n;i++){
    //   int x=sc.nextInt();
    //   st.push(x);
    // }
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    st.push(6);
    System.out.println(st);
    // reverse oreder
    Stack<Integer> gt =new Stack();
    while(st.size()>0){
     // int x=st.peek();
      gt.push(st.pop());
     // st.pop();
    }
    Stack<Integer> rt =new Stack();
    while(gt.size()>0){
      rt.push(gt.pop());
      //st.push(rt.pop());
    }
   

    System.out.println(rt);
    System.out.println(st);
  }
  
}
