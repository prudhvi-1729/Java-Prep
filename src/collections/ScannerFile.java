package collections;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerFile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array input");
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Array "+Arrays.toString(arr));
    }
}
