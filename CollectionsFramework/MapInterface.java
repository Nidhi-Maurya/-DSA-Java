import java.util.*;

public class MapInterface {
  public static void main(String[] args) {
    Map<Integer,String> mp=new HashMap<>(); 
mp.put(3,"Nidhi");
mp.put(1,"rjnish");
mp.put(2,"ishu");
System.out.println(mp);
// its out put  1=rjinish,2=ishu,3=Nidhi
System.out.println(mp.get(2));// ishu
// put method is used to add value and key
// get() function is used to retrive the data
System.out.println(mp.containsKey(5));// false
// .contains is used that check that key is exist or not
System.out.println(mp.containsValue("rjnish"));// true
 // contains value is used to check given valuee is exist or not in 

 // keySet is used to getall key 
 // value set is used to get all values

 // iterate over value in map
 for(String i:mp.values()){
  System.out.println(i);
 }
 // iterate over keySet in map
 for(Integer i:mp.keySet()){
  System.out.println(i);
 }

 // iterate over key value, mapping

for(var e:mp.entrySet()){
  System.out.println(e);
}

  }
  
}
