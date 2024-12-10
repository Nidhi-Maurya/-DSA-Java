package string2;
import java.util.*;
public class builder {

public static void main(String[] args) {
  
  StringBuilder str= new StringBuilder("Hello");
 //str.setCharAt(0, 'm');
  //System.out.println(str);
  //str.append("true");

  str.insert(2, 'y');
  //System.out.println(str);

  // delte

str.deleteCharAt(2);
 System.out.println(str);


}

  
}
