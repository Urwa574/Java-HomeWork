package HomeWorkClass28;

import java.util.ArrayList;
import java.util.Iterator;

public class task6Part_B {
    public static void main(String[] args) {
        //Create 3 objects of the sub-classes and store them in ArrayList. Using for loop/advanced for loop/ iterator access all methods of the class.
        car c=new car();
        pet p=new pet();
        Health health=new Health();
        ArrayList<Insurance> obj=new ArrayList<>();
        System.out.println("m1");
        obj.add(c);
        obj.add(p);
        obj.add(health);
        for (int i = 0; i <obj.size(); i++) {
            Insurance in= obj.get(i);
            in.cancelInsurance();
            in.getQuote();
        }
        System.out.println("m2");
        for(Insurance ob:obj){
           ob.cancelInsurance();
           ob.getQuote();
        }
        System.out.println("m3");
        Iterator<Insurance> iterator= obj.iterator();
        while (iterator.hasNext()){
            Insurance i=iterator.next();
            i.getQuote();
            i.cancelInsurance();

        }


    }
}
