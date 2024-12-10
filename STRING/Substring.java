 package STRING;

public class Substring {
  public static String subString(String str,int si,int ei){
    String substr="";
    for(int i=si;i<ei;i++){
      substr+=str.charAt(i);
    }
    return substr;
  }
  public static void main(String[] args) {
    String str="NIDHIMAURYA";
   // System.out.println(subString(str,5,9));
   System.out.println(str.substring(5,9));
  }
  
}
