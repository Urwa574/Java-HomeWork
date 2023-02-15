package HomeWorkClass18and19;

public class Teacher {
    /*
    Write a Java program called Teacher.  Identify features and 4 behaviour of that Class.
     Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features and behaviour.
      Test all 4 classes
     */
    String name;
    int age;
    int id;
    void printInfo(){ //behaviour1
        System.out.println("My name is "+name+" age "+age+" my id is "+id);
    }
   void grade(){
       System.out.println("grade doesn't matter");
   }
   void homework(){
       System.out.println("homework makes student perfect!!!");
   }
   void extrapoint(){
       System.out.println("if al students attend class get extra marks");
   }
}
class MathTeacher extends Teacher{
    String subject;
    void printmath(){
        System.out.println("my math teacher name is "+name+" and subject is "+subject);
    }
}
class ChemistryTeacher extends MathTeacher{
    int noofstudents;
    void printchem(){
        System.out.println("my chemistry teacher name is "+name+" subject is "+subject+" no of student are "+noofstudents);
}}
class PianoTeacher extends ChemistryTeacher {
    boolean enjoy;
    void printpiano(){
        System.out.println("my chemistry teacher name is "+name+" subject is "+subject+" no of student are "+noofstudents+" and  are students enjoying the class? "+enjoy);
}
}