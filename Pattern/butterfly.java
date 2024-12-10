public class butterfly {


  public static void butterFlyPattern(int n){
    // FIRST HALF
    for(int i=1;i<=n;i++){
      // stars =i
      for(int j=1;j<=i;j++ ){
        System.out.print("* ");
      }
      // spaces = 2*(n-i)
      for(int k=1;k<=2*(n-i);k++){
        System.out.print("  ");
      }
      // stars 
      for(int k=1;k<=i;k++){
        System.out.print("* ");
      }
      System.out.println();
    }

    //2nd half
    for(int i=n;i>=1;i--){
      // stars =i
      for(int j=1;j<=i;j++ ){
        System.out.print("* ");
      }
      // spaces = 2*(n-i)
      for(int k=1;k<=2*(n-i);k++){
        System.out.print("  ");
      }
      // stars 
      for(int k=1;k<=i;k++){
        System.out.print("* ");
      }
      System.out.println();
    }

     
  }
  public static void main(String[] args) {
    butterFlyPattern(4);
  }
  
}
