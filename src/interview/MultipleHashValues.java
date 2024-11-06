package interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MultipleHashValues {

    public static void main(String[] args){
        HashMap<String, List<Integer>> hmap = new HashMap<>();
        hmap.computeIfAbsent("prudhvi",k-> new ArrayList<>()).add(30);
        hmap.computeIfAbsent("prudhvi",k->new ArrayList<>()).add(40);

        System.out.println(hmap);
    }
}
