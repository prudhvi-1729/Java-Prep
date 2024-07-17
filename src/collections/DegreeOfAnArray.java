package collections;

import java.util.HashMap;
import java.util.Map;

import static java.util.Collections.max;

public class DegreeOfAnArray {
    int freq_key=0;
    int freq_value =0;
    public static void main(String[] args){
        DegreeOfAnArray obj = new DegreeOfAnArray();
        int[] arr = {1,2,1,3,2,4,2,2,8,2,9};
        Map<Integer,Integer> freq= new HashMap<>();
        for (int j : arr) {
            if (!freq.containsKey(j)) {
                freq.put(j, 1);
            } else {
                freq.put(j, freq.get(j) + 1);
            }
        }
        System.out.println(freq);
        System.out.println(max(freq.values()));

        for(Map.Entry<Integer,Integer> entry: freq.entrySet()){
            if(entry.getValue()> obj.freq_key){
                obj.freq_key= entry.getKey();
                obj.freq_value=entry.getValue();
            }
        }
        System.out.println("max freq key"+obj.freq_key);

    }
}
