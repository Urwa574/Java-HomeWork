package HomeWorkClass29;

import java.util.HashMap;

public class Task2Student {
    public static void main(String[] args) {
        //Create a Set collection that will hold Objects of Student Type.
        // In this set we do not care about the insertion order. Each student object should have name and studentID.
        // Display name of each student.
        HashMap<String,Integer> students=new HashMap<>();
        students.put("Urwa",30);
        students.put("Sam",10);
        students.put("Aysha",15);
        students.put("Nana",2);
        students.put("Yousaf",1);
        students.put("Alayna",8);
        System.out.println(students);
    }
}
