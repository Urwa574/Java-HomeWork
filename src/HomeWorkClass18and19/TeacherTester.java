package HomeWorkClass18and19;

public class TeacherTester {
    public static void main(String[] args) {
        Teacher teacher1=new Teacher();
        teacher1.name="Urwa";
        teacher1.age=23;
        teacher1.id=987;
        teacher1.printInfo();
        MathTeacher math=new MathTeacher();
        math.name="laiba";
        math.age=25;
        math.id=89;
        math.subject="math";
       // math.printInfo();
        math.printmath();
        ChemistryTeacher chem=new ChemistryTeacher();
        chem.name="tanzila";
        chem.age=35;
        chem.id=65;
        chem.subject="chemistry";
        chem.noofstudents=34;
        chem.printchem();
        PianoTeacher piano=new PianoTeacher();
        piano.name="hashim";
        piano.age=22;
        piano.id=234;
        piano.subject="piano class";
        piano.noofstudents=60;
        piano.enjoy=true;
        piano.printpiano();


    }
}
