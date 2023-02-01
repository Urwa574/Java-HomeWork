package HomeWorkClass17;

public class Task3 {
    /*3) Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
     and create 4 objects of this class: 1 - inside same class; 2 - from outside the class; 3 - from different class inside different package
      and observe result.
     */
     String name;
     String phoneNO;
    int year;
   protected double marks;
    char gender;
    //def
    Task3 (char Gender){
        gender=Gender;
    }

    public Task3(String Taskname, int Task3year){
        name=Taskname;
        year=Task3year;
    }
    protected Task3(double Task3Marks){
       marks=Task3Marks;
    }
    private Task3 (String Task3phoneNo){
        phoneNO=Task3phoneNo;
    }
    void printInfo(){
        System.out.println(phoneNO);
    }
    public static void main(String[] args) {
        Task3 taskPri=new Task3("0300++++++++"); //only hv access within a class
        taskPri.printInfo();

        Task3 taskPub=new Task3("Urwa",2023);
        Task3 taskDef=new Task3('F');
        Task3 taskpro=new Task3(98.5);

    }
}

