package STACKS;
import java.util.*;

public class basicStack {
  public static void main(String[] args) {
    
   Stack<Integer>st=new Stack<>();
   System.out.println("size is : " +  st.size());
   System.out.println(st);
   st.push(1);
   System.out.println("size is : " +  st.size());
   System.out.println(st);

   st.push(32);
   System.out.println("size is : " +  st.size());
   System.out.println(st);

   st.push(5);
   System.out.println("size is : " +  st.size());
   System.out.println(st);

   st.push(88);
   System.out.println("size is : " +  st.size());
   System.out.println(st);
  
   //  peek return top most value of a stack;
  //  System.out.println(st.peek());
  //  System.out.println(st);
  // st.pop();
   //System.out.println(st);
  
  
   



  //  while(st.size()>2){
  //        st.pop();
  //  }
  //  System.out.println(st.peek());
  //  System.out.println(st);
  


  }
  
}
