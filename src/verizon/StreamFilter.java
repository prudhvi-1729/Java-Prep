package verizon;

import java.util.*;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args){
        int[] arr ={8,10,25,15,30};
        Arrays.stream(arr).mapToObj(s->s+"").filter((s)->s.startsWith("1")).forEach(System.out::println);


        Integer[] array = {1,2,3,4,5,2,3,4,5,2,2,3,4,5,6,6};
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicateElements = Arrays.stream(array).filter(e -> !set.add(e)).collect(Collectors.toSet());
        System.out.println(duplicateElements);

        //single element frequency
        for(int i:array) {
            System.out.println("frequency");
            System.out.println(i+" "+Collections.frequency(List.of(array), i));
        }


    }
}
