package OPPs; 

public class opps {
  public static void main(String[] args) {
    Pen p1=new Pen();
    p1.setColor("blue");
    System.out.println(p1.color);
    p1.setTip(5);
    System.out.println(p1.tip);

    //CONSTRUCTOR
    Student1 s1=new Student1();
  }
}
class Pen{
  //properties +function 

  String color;
  int tip;

  void setColor(String newColor){
    color=newColor;
  }
  void setTip(int newTip){
    tip=newTip;
  }

}

class Student{
  String name;
  int age;
  float percentage;

  void calcPercentage(int py, int math,int chem,int hindi){
    percentage=(py+math+chem)/3;
  }
}

//  CONSTRUCTOR

class Student1{
  String name;
  int roll;

  
  Student1(){
    System.out.println("constructor is called...");

  }

}