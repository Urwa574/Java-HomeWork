package HomeWorkClass30;

import java.util.Map;
import java.util.TreeMap;

public class Task3 {
    public static void main(String[] args) {
        //3)Create a Map that will store Employee name and salary.
        // Write a logic to retrieve an employee who gets the highest salary. Output should be in the below format
        //John Smith=$100000
        Map<String,Integer> employee= new TreeMap<>();
        employee.put("Raiyan",7352671);
        employee.put("Daniyal",927863);
        employee.put("Maaz",8236153);
        employee.put("Faiq",298705);
        //logic
      var Emp=employee.entrySet();
        int highSalary=0;
        String highSalaryEmp="";
        for (var entry:Emp){
            if(entry.getValue()>highSalary){
                highSalary=entry.getValue();
               highSalaryEmp=entry.getKey();
            }
        }
        System.out.println(highSalaryEmp+"="+highSalary);
    }
}
