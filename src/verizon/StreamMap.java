package verizon;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {

    public static void main(String[] args){
        Integer[] arr = {1,2,3,4,5,6,7,8,9};

        List<Integer> list = Arrays.asList(arr);
        List<Integer> result = list.stream().map(i -> i+1).toList();
        System.out.println(result);
    }
}
