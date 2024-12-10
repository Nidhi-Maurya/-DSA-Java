package OPPs;

public class student {
   String name;
     int rollno;
    double percentage;
   private static int noOfStudent;
//this is default constructor
    public student(){

    }

// Constructoer
public student(String naam,int roll,double per){
  name=naam;
  rollno=roll;
  percentage=per;
noOfStudent++;
}
// getter function for construcor
public int getNumberOfStudent(){
  return noOfStudent;
}
    public int getRollno(){// getter
      return rollno;
    }

    public void setRollno(int roll){//setter  
      rollno=roll;
    }
}
