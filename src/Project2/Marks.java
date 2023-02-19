package Project2;

public abstract class Marks {
    /*2. We have to calculate the average of marks obtained in three subjects by student A and by student B.
    Create class 'Marks' with an abstract method 'getPercentage' that will be returning
the average percentage of marks.
Provide implementation of abstract method in classes
'A' and 'B'. The constructor of student A takes the
marks in three subjects as its parameters and
the marks in four subjects as its parameters for
student B. Test your code
     */
    abstract void getPercentage();
}
class A extends Marks{
     int english;
     int maths;
     int java;
    //double avg=english+maths+java/3;
    public A(int english, int maths, int java) {
       this.english = english;
        this.maths = maths;
        this.java = java;
    }
    @Override
    void getPercentage() {
        System.out.println("Average marks of student A is "+(english+maths+java)/3+"%");
    }
}
class B extends Marks{
    int english;
    int maths;
    int java;
    int science;

    public B(int english, int maths, int java, int science) {
        this.english=english;
        this.java=java;
        this.maths=maths;
        this.science = science;
    }
    @Override
    public void getPercentage() {
        System.out.println("Average marks of student B is "+(english+maths+java+science)/4+"%");
    }
}