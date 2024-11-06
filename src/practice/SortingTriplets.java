package practice;

import java.util.Arrays;

public class SortingTriplets {
    public static void main(String[] args){
        int count1=0;
        int count2=0;
        int count3=0;
        int[] arr={1,3,3,1,2,1,3,2,3};
        for(int i:arr){
            if(i==1) count1++;
            if(i==2) count2++;
            if(i==3) count3++;
        }
        int j=0;
        System.out.println(count1+" "+count2+" "+count3);
        while(count1>=1){
            System.out.println(j);
            arr[j]=1;
            count1--;
            j=j+1;
        }
        while(count2>=1){
            arr[j]=2;
            count2--;
            j=j+1;
        }
        while(count3>=1){
            arr[j]=3;
            count3--;
            j=j+1;
        }

        System.out.println(Arrays.toString(arr));

    }
}
