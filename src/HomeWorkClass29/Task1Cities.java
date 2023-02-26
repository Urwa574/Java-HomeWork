package HomeWorkClass29;

import java.util.LinkedHashSet;

public class Task1Cities {
    public static void main(String[] args) {
        //Create a Set of cities in which you want to make sure that insertion order is maintained. Then remove any city that starts with “A”;
        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Karachi");
        cities.add("Lahore");
        cities.add("Islamabad");
        cities.add("Multan");
        cities.add("Ahamdabad");
        System.out.println(cities);
        cities.removeIf(s->s.startsWith("A"));
        System.out.println(cities);
    }
}
