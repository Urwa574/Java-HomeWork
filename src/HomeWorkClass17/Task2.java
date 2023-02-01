package HomeWorkClass17;

public class Task2 {
    /* 2)Write a java Class Students that have a constructor which takes students name and 3 subject grades.
     Inside your class also have a method to Calculate Average Grade.
      Test Student class for 5 different students with different marks.
       Your program should print an average mark of each student's name.
     */
    String name;
    double subjectScience;
    double subjectEnglish;
    double subjectMaths;
    Task2(String Task2Name,double Task2subjectScience,double Task2subjectEnglish,double Task2subjectMaths){
        name=Task2Name;
        subjectScience=Task2subjectScience;
        subjectEnglish=Task2subjectEnglish;
        subjectMaths=Task2subjectMaths;
    }
    void  averageMarks(){
        double Average=(subjectScience+subjectMaths+subjectEnglish)/3;
        System.out.println(Average);
    }

    public static void main(String[] args) {
        Task2 student1=new Task2("Urwa",96.5,98.5,98);
        student1.averageMarks();
        Task2 student2=new Task2("Rubeel",59.5,66.2,92.2);
        student2.averageMarks();
        Task2 student3=new Task2("Ali",87.5,89.7,46.5);
        student3.averageMarks();
        Task2 student4=new Task2("Laiba",56,98,76.5);
        student4.averageMarks();
        Task2 student5=new Task2("Hashim",33.5,70,46.5);
        student5.averageMarks();
    }
}
