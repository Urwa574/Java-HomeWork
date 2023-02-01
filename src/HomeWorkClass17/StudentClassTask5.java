package HomeWorkClass17;

public class StudentClassTask5 {
    /* 5) Write a Student class that have instance variables name and address.
     Create a constructor that will initialize those variables.
     Print name & address of given  student using displayInfo method.
     */
    String name;
    String address;
    StudentClassTask5(String Name,String Address){
        name=Name;
        address=Address;
    }
    void StudentInfo(){
        System.out.println(name+" "+address);
    }

    public static void main(String[] args) {
        StudentClassTask5 student=new StudentClassTask5("Urwa","Gulshan Town");
        student.StudentInfo();
    }
}
