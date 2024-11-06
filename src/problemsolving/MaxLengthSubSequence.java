package problemsolving;

import java.util.Arrays;

public class MaxLengthSubSequence {
    public static void main(String[] args){
        int[] arr ={10,22,9,33,21,50,41,60,22,68,90};
        int[] result = new int[arr.length];
        Arrays.fill(result,1);
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j]){
                    result[i]=Math.max(result[i],result[j]+1);
                }
            }
        }

        System.out.println(Arrays.stream(result).max().getAsInt());
    }
}
