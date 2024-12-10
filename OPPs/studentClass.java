package OPPs;
import java.util.*;

public interface studentClass {
  //Creating a new data type
 
  public static void fun(student x){

  System.out.println(x.name);

  }

//   public static class Car{
//     String name;
//    String type;
// int  price;

//   }

public static void change(student x){
  //x.name="rohan";
  return;
}
  public static void main(String[] args) {
    // Scanner sc=new Scanner(System.in);// taking class for input
    // int z=sc.nextInt();

      // Car c1=new Car();
      // c1.name="ALTO";
      // c1.price= 400000;
      // c1.type= "hatchback";

    // student s1=new student("Nidhi",58,98.95);// declaration it is also called a objects
   // s1.name="Nidhi";// initializations
//s1.percentage=89.87;
//s1.rollno=58;
    //System.out.println(s1.rollno +2);
   // fun(s1);
//System.out.println(s1.getRollno());
//s1.setRollno(58);
//updation
 // s1.name="Maurya";
 
//change(s1);
// System.out.println(s1.name); 
// System.out.println(s1.rollno); 
// System.out.println(s1.percentage); 

student s1=new student("Nidhi",58,98.95);
student s2=new student("Nidhi",58,98.95);
student s3=new student("Nidhi",58,98.95);
 System.out.println(s1.getNumberOfStudent());
 System.out.println(s2.getNumberOfStudent());
 System.out.println(s3.getNumberOfStudent());
  
  }
}
