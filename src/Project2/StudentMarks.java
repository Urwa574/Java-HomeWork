package Project2;

public class StudentMarks {
    public static void main(String[] args) {
//        A a=new A(75,80,89);
//        a.getPercentage();
//        B b=new B(90,72,99,81);
//        b.getPercentage(); // can use this method too
       Marks [] marks={new A(75,80,89), new B(90,72,99,81)};
            for (Marks m:marks){
                m.getPercentage();

            }

    }
}
