package STRING;

public class practice {

  public static void main(String[] args) {
    String str="nidhiiiiiiiiiiii";

    int count=0;
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      if(ch== 'a'|| ch=='e'|| ch=='i'|| ch=='e'||ch=='o'|| ch=='u'){
        count ++;
      } 
    } 
    System.out.print(count);
  }
  }

