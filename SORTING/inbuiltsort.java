package SORTING;
import java.util.Arrays;
import java.util.Collections;


public class inbuiltsort {

  public static void printArr( Integer arr[]){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    Integer arr[]={12,5,7,9,2,4,5,1,3,0,34,23,54,67,89,11,34};
      Arrays.sort(arr,Collections.reverseOrder());
    printArr(arr);
  }
  
}
