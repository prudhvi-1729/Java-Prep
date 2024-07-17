package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetCollection {

    public static void main(String[] args){
        HashSet<String> h_set = new HashSet<String>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");

        Iterator<String> p = h_set.iterator();

        // Iterate the hash set
        while(p.hasNext()) {
            System.out.println("hi "+p.next());
        }

        // clone hashset
        // Cloned Hash Set: [Red, White, Pink, Black, Yellow, Green]
        HashSet <String> new_h_set = new HashSet <String> ();
        new_h_set = (HashSet)h_set.clone();
        System.out.println("Cloned Hash Set: " + new_h_set);

        //empty hashset
        h_set.clear();

        //h_set.removeAll(h_set);
        System.out.println("Hash Set after removing all the elements "+h_set);

        //use obj.contains(key) to find in hashset

        // compare two sets and retain elements that are the same in both
        // h_set1.retainAll(h_set2);

    }
}
