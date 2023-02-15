package HomeWorkClass19;

public class TesterEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("urwa", "IT", 3400);
        emp.printInfo();
        emp.print();
        Fulltime full = new Fulltime("laiba", "IT", 4200, "500", 200);
        full.fulltime();
        full.display();
        Parttime part = new Parttime("Urwa", "Accounts", 3200, "700", 5600, true);
        part.forStudents();
    }
}
