package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
    public static void main(String[] args){
        Integer[] arr = {1,2,3,4,5,6,7};
        List<Integer> list = Arrays.asList(arr);
        List<Integer> list2 = new ArrayList<>(List.of(arr));
        Collections.reverse(list2);
        System.out.println(list2.stream().min(Integer::compareTo).stream().toList());
    }
}
