//package Pattern;

public class invertedpyramid {

  public static void invertRotedHalfPyramid(int n){
    for(int i=1;i<=n;i++){// outerloop
      for(int j=1;j<=n-i;j++){

      System.out.print("  ");
      }
        for(int k=1;k<=i;k++){
          
          System.out.print("* ");
        }
        System.out.println();
      }
      }
    
  
  public static void main(String[] args) {
    invertRotedHalfPyramid(4);
    
  }
  
}
