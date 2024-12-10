package TWODARRAYS;

public class practice3 {

  public static void tranposeMatrix(int arr[][]){
    int row=2,col=3;
    int transpose[][]=new int [col][row];
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        transpose[j][i]=arr[i][j];
      }
    }
     printMatrix(transpose);
   
  }

  public static void printMatrix(int arr[][]){
    System.out.println("transpose matrix is: ");
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[0].length;j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    int arr[][]={{11,12,13},
                 {21,22,23}};
      tranposeMatrix(arr);
     
      
  }
  
}
