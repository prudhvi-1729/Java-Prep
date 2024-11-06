package practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetPractice {
    public static void main(String[] args){
        String[] arr = {"2","3","4","5","6","7","8","9","10"};
        HashSet<String> hset = new HashSet<String >(List.of(arr));


        Iterator<String> itr = hset.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        HashSet<String> hset2= new HashSet<String>();
        hset2.add("1");
        hset2.add("2");
        hset2.add("3");

        System.out.println(hset.contains("prudhvi"));

        hset.retainAll(hset2);

        hset2.clear();
        System.out.println(hset);
        System.out.println(hset2);
    }
}
