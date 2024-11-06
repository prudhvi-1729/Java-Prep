package interview;

import java8features.Instrument;

import java.util.HashMap;
import java.util.Map;

public class ConcurrentException {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap();
        map.put(1, "prudhvi");
        map.put(2, "tanmai");
        map.put(3, "laxmi");

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            map.put(4,"sun");//cncurrentException
        }
    }
}
