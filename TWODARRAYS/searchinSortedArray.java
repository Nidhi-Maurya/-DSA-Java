package TWODARRAYS;

public class searchinSortedArray {

  // First senarrio

  //time complexity O(n+m)

  public static boolean SortedSearch(int matrix[][],int key){


    int row=0,col=matrix[0].length-1;
    while(row<matrix.length&& col>=0){
      if(matrix[row][col]==key){
        System.out.println("found key at ("+row+" ,"+col+" )");
        return true;
      }

      else if(key<matrix[row][col]){
        col--;
      }
      else{
        row++;
      }

    }
   System.out.println("not Found");
   return false;
   
  }
  
  // Second SENARIO

  // Time Complexity O(n+m)

  public static void StairingSearch(int matrix[][],int key){
    int row=matrix.length-1 ;
    int col=0;

    while(row<0 && col>matrix[0].length){
      if(matrix[row][col]==key){
        System.out.println("key found at ("+row+","+col+")");
      }
     else if(key<matrix[row][col]){
              col--;
      }
      else{
        row++;
      }
    }
  }





  public static void main(String[] args) {
    int matrix[][]=    {{10,20,30,40},
                         {15,25,35,45} ,  
                         {27,29,37,48},
                         {32,33,39,50} }; 
                         int key=35;
      SortedSearch(matrix, key);
      StairingSearch(matrix, key);
  }
  
}
