package SORTING;

public class selectionSort {

  public static void selectionSort(int arr[]){
    for(int turn=0;turn<arr.length-1;turn++){
      int minPos=turn;
      for(int j=turn+1;j<arr.length;j++){
        if(arr[minPos]>arr[j]){
          // for decreasing order we change the greateter symbol int o smalll
          minPos=j;
        }
      }
      //swap 
      int temp=arr[minPos];
      arr[minPos]=arr[turn];
      arr[turn]=temp;
    }
  }
  public static void printArr(int arr[]){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    int arr[]={2,4,5,3,1};
    selectionSort(arr);
    printArr(arr);
    
  }
  
}
