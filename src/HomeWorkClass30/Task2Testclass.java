package HomeWorkClass30;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task2Testclass {
    //In Test Class create a Map that will store key in ascending order.
    // In that map store personId and a Person Object. Print each object details.
    public static void main(String[] args) {
        Map<Integer,Task2Person> person=new TreeMap<>();
        person.put(1,new Task2Person("Urwa","Waseem",24,29876));
        person.put(2,new Task2Person("Hana","Mehar",21,97508));
        person.put(3,new Task2Person("Shahram","Shari",35,2738));
        person.put(4,new Task2Person("Agha","Rubeel",25,98877));
    //    Set<Map.Entry<Integer,Task2Person>> personDetail=person.entrySet();
        var persondetail=person.entrySet();
        for (var personDetails:persondetail){
            System.out.println(personDetails.getKey()+" "+personDetails.getValue());
            personDetails.getValue().details();
        }

    }
}
