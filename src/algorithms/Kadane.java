package algorithms;

public class Kadane {
    public static void main(String[] args){
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        Kadane.kadaneAlgo(arr);
    }

    public static void kadaneAlgo(int[] arr){
        int currSum=arr[0];
        int maxSum=arr[0];
        for(int i=1;i<arr.length;i++){
            currSum=Math.max(arr[i],currSum+arr[i]);
            maxSum=Math.max(maxSum,currSum);
        }
        System.out.println(maxSum);
    }
}
