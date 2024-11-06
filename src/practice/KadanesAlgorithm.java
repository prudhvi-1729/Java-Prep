package practice;

public class KadanesAlgorithm {
    public static void main(String[] args){
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int arrSum = arr[0];
        int currSum =arrSum;
        for(int i=1;i<arr.length;i++){
            currSum=Math.max(arr[i],currSum+arr[i]);
            arrSum=Math.max(arrSum,currSum);
        }
        System.out.println(arrSum);
    }

}
