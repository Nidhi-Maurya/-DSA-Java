package TWODARRAYS;

public class diagonalSum {

 public static int diagonalSum(int matrix[][]){
  
  int sum=0;
// its time complexity is O(n^2) so it is a brute force method;

// for(int i=0;i<matrix.length;i++){
//   for(int j=0;j<matrix[0].length;j++){

//     //primary diagonal
//        if(i==j){
//         sum+=matrix[i][j];
//        }
//        else if(i+j==matrix.length-1){
//         sum+=matrix[i][j];
//        }
//   }
 
// }
  // +++liner way code optimizartion+++++++++

// time complexity O(n^2)

  for(int i=0;i<matrix.length;i++){
    // primary sum
    sum+=matrix[i][i];
  
    // secondary ssum;
    // logic i+j=n-1
    // so j=n-1-i;

    if(i!=matrix.length-1-i){
      sum+=matrix[i][matrix.length-1-i];
    }
    
  }
return sum;
 }
  public static void main(String[] args) {
    int matrix[][]={{1,2,3,4},
                     {5,6,7,8} , 
                    {9,10,11,12  } ,
                     {13,14,15,16}   
                       };
     System.out.println(diagonalSum(matrix)); 
  }
  
}
