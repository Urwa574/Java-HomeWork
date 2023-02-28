package HomeWorkClass30;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.TreeMap;

public class BuyStoreTask1 {
    public static void main(String[] args) {
        //1) Create a map of Best Buy store. Place
        //item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
        //Retrieve all keys and values from a Best Buy map using EntrySet.
        Map<Integer,String> store=new HashMap<>();
        store.put(7664847,"Printer");
        store.put(7879885,"Tv");
        store.put(98654,"Computer");
        store.put(35686,"Laptop");

        Set<Map.Entry<Integer,String>> entrySet=store.entrySet();
        for(Map.Entry<Integer,String> entry:entrySet){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
