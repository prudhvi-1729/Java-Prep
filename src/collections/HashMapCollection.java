package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapCollection {

    public static void main(String[] args){
        HashMap<Integer,String> h_map = new HashMap<Integer,String>();

        h_map.put(1,"green");
        h_map.put(2,"blue");
        h_map.put(3,"yellow");
        h_map.put(4,"purple");

        for(Map.Entry x:h_map.entrySet()){
            System.out.println(x.getKey()+" "+x.getValue());
        }

        HashMap<Integer,String> hash_map2 = new HashMap<Integer,String>();

        // put all values in secondmap
        hash_map2.putAll(h_map);

        // Removing all the elements from the linked map
        hash_map2.clear();

        //check if key present in hashmap
        System.out.println(h_map.containsKey("orange"));

        // create set view for the map
        Set set = h_map.entrySet();

        // check set values
        // Set values: [1=green, 2=blue, 3=yellow, 4=purple]
        System.out.println("Set values: " + set);

        // get value of key 3
        String val=(String)h_map.get(3);

        // get keyset value from map
        Set keyset = h_map.keySet();

        System.out.println("Key set values are: " + keyset);

        // checking collection view of the map
        System.out.println("Collection values view is: "+ h_map.values());

    }
}
