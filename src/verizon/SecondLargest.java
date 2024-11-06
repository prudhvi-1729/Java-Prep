package verizon;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SecondLargest {

    public static void main(String[] args){
        Integer[] arr = {1,2,3,4,9,8,6,5,7};
        int firstLargest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>firstLargest){
                secondLargest=firstLargest;
                firstLargest=i;
            }
            else if(i>secondLargest && 1!=firstLargest){
                secondLargest=i;
            }
        }
        System.out.println(firstLargest+" "+secondLargest);

        //by sorting
        List<Integer> li = Arrays.asList(arr);
        Collections.sort(li);
        System.out.println(li.get(li.size()-2));

        //add one to all entries in arr
        List result =Arrays.stream(arr).map(i-> i+1).collect(Collectors.toList());
        System.out.println(result);
    }

}
