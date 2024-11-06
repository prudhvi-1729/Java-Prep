package collections;

import java.util.LinkedHashSet;

public class LinkedHashSetCollection {
    public static void main(String[] args) {
        //LinkedHashSet
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(1);
        set.add(2);
        set.add(null);
        set.add(null);

        System.out.println(set);
    }
}
