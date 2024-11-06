package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class ScannerFile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array input");
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Array "+Arrays.toString(arr));
        Integer[] data = {1,2,3,4,5};
        List<Integer> list = Arrays.asList(data);
        ArrayList<Integer> list1= new ArrayList<>(Stream.of(1,2,3).toList());
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(data));
        ArrayList<Integer> arrList1 = new ArrayList<>(List.of(data));
    }
}
