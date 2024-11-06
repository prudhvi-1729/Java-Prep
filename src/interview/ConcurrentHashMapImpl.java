package interview;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapImpl {

    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        map.put(1, "prudhvi");
        map.put(2, "tanmai");
        map.put(3, "laxmi");

        System.out.println(map);
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            map.put(4,"sun");
            if(entry.getValue().equals("tanmai")){
                map.put(3,"moon");
            }
        }
    }
}
