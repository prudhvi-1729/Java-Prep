package problemsolving;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallenge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] strArr= parseInput(input);
        for(String i:strArr){
            System.out.println(i);
        }
        System.out.println("Result is :"+challengeResult(strArr));
    }

    private static String challengeResult(String[] strArr) {
        int[] arr1=parseArray(strArr[0]);
        int[] arr2=parseArray(strArr[1]);
        int maxLength = Math.max(arr1.length,arr2.length);
        int[] result = new int[maxLength];
        for(int i=0;i<maxLength;i++){
            if(i<arr1.length){
                result[i]+=arr1[i];
            }
            if(i<arr2.length){
                result[i]+=arr2[i];
            }
        }

        StringBuilder st = new StringBuilder();
        for(int i=0;i<result.length;i++){
            st.append(result[i]);
            if(i<result.length-1){
                st.append("-");
            }
        }
        return st.toString();
    }

    private static int[] parseArray(String str) {
        str = str.trim().replaceAll("[\\[\\]]","");
        String[] strArr = str.split(",");
        int[] intArr = new int[strArr.length];
        for(int i=0;i< strArr.length;i++){
            intArr[i]=Integer.parseInt(strArr[i].trim());
        }
        return intArr;
    }

    private static String[] parseInput(String input) {
        input=input.trim();
        int firstBracketIndex = input.indexOf('[');
        int lastBracketIndex = input.indexOf(']');

        if(firstBracketIndex==-1 && lastBracketIndex==-1){
            throw new IllegalArgumentException("input format is invalid");
        }

        String array1= input.substring(firstBracketIndex,lastBracketIndex+1);
        String array2= input.substring(input.indexOf('[',lastBracketIndex+1),input.lastIndexOf(']')+1);

        return new String[]{array1,array2};
    }
}
