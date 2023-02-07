package HomeWorkClass19;

public class Employee {
    //2. Create an Employee class that will have variables and methods.
    // Constructor that should initialize instance variables
    //Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
    //Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.
    //Test your code!
    String name;
    String department;
    double salary;
     Employee(String name,String department,int salary){
         this.department=department;
         this.name=name;
         this.salary=salary;
     }
     void printInfo(){
         System.out.println("the name of employee is "+name);
     }
     void print(){
         System.out.println(" department: "+department+"  salary: "+salary);
     }
}
class Fulltime extends Employee{
    String Yearlybonus;
    double workingHour;
     Fulltime(String name,String department,int salary,String yearlybonus,double Workinghours){
         super(name,department,salary);
         this.workingHour=Workinghours;
         this.Yearlybonus=Yearlybonus;
     }
     void fulltime(){
         System.out.println("full time employee will get yearly bonus "+Yearlybonus);
     }
     void display(){
         System.out.println("after working "+workingHour+" hours");
     }
}
class Parttime extends Fulltime{
    boolean students;
    Parttime(String name,String department,int salary,String yearlybonus,double workinghours,boolean students){
        super(name,department,salary,yearlybonus,workinghours);
        this.students=students;
    }
    void forStudents(){
        System.out.println("part time job is for students? "+students);
    }

}