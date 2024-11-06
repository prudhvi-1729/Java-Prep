package collections;

import java.util.Arrays;
import java.util.List;

public class ArrayFunctions {
    public static void main(String[] args){
        Integer[] arr={1,2,3,4,5,6,9,8,7};
        System.out.println(Arrays.toString(arr));
        List<Integer> list = List.of(arr); // Arrays.asList(arr);
        System.out.println(list);
        int[] numbers = {1, 2, 3, 4, 5};
        int[] copy = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.equals(numbers,copy));
    }
}
