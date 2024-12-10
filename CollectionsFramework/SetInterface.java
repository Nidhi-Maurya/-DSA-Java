import java.util.*;

public class SetInterface {

  public static void main(String[] args) {
HashSet<Integer> st=new HashSet<>();
// set is a collection of distinct elemnt or unique element
// in set we cannot add duplicate value
// hashSet properties .remove(), .contains(), .size(),
// it is unorderd functions
// its do hashing internally

      st.add(1);
      st.add(2);
      st.add(3);
      st.add(4);

      System.out.println(st);
      st.add(1);
      st.add(2);
      st.add(3);
      System.out.println(st);

      st.remove(3);
      System.out.println(st);
  }
  
}
