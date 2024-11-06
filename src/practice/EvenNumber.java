package practice;

import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenNumber {
    public static void main(String[] args){
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(nums);
        List<Integer> result = nums.stream().filter(n -> n%2==0).toList();
        System.out.println(result);
        List<String> streamList = Stream.of("123","2","3","4").toList();
        System.out.println(streamList);

        String encoded = Base64.getEncoder().encodeToString("PrudishHello".getBytes());
        String decodedString = new String(Base64.getDecoder().decode(encoded));
        System.out.println(encoded+" "+decodedString);

        //move all negative numbers to left side
        int[] arr ={0,-1,-2,6,5,-5,9,3};
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            if(arr[left]<0){
                left++;
            }
            if(arr[right]>0){
                right--;
            }
            else{
                int temp = arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
