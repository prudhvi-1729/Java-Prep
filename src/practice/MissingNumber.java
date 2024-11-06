package practice;

import java.util.Arrays;
import java.util.HashSet;

public class MissingNumber {
    public static void main(String[] args){
        int[] arr = {9,8,7,6,4,3,2,1};
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length-1];
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]+1){
                System.out.println(arr[i-1]+1);
            }
        }

        //duplicates in a array
        int[] data ={1,2,3,4,5,6,7,4,2,1};
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for(int d:data){
            if(!hs.add(d)){
                System.out.println(d);
                duplicates.add(d);
            }
        }
        System.out.println(duplicates);

    }
}
