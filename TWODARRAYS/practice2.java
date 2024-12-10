package TWODARRAYS;

public class practice2 {

  public static void rowSum(int arr[][]){
    int sum=0;
    for(int j=0;j<arr[0].length;j++){
      sum+=arr[1][j];
    }

    System.out.println(sum);
  }
  public static void main(String[] args) {
    int arr[][]={{1,4,9},{11,4,3},{2,2,3}};
    rowSum(arr);
  }
  
}
