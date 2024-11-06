package practice;

import java.util.Arrays;

//sliding window technique
public class SubArraySum {

    public static void main(String[] args) {
        int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
        int targetSum = 23;
        int currentSum = 0;
        int start=0;
        for(int i=0;i<arr.length;i++){
            currentSum=currentSum+arr[i];
            while(currentSum>targetSum && start<=i){
                currentSum-=arr[start];
                start+=1;
            }
            if(currentSum==targetSum){
                System.out.println(start+" "+i);
            }
        }

    }
}
