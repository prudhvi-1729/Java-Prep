package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Integer n = sc.nextInt();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        System.out.println(arr);
        Integer min=Integer.MAX_VALUE;
        Integer max=Integer.MIN_VALUE;
        for(Integer j:arr){
            if(j<min){
                min=j;
            }
            if(j>max){
                max=j;
            }
        };
        System.out.println(min+" "+max);

        int[] numbers = {3, 5, 7, 2, 8, -1, 4, 10, 12};
        int result = Arrays.stream(numbers).min().getAsInt();
        System.out.println("result"+result);

        Integer arraylistResult = arr.stream().min(Integer::compareTo).get();
        Integer arraylist = arr.stream().min((a,b)-> a.compareTo(b)).get();
    }
}
