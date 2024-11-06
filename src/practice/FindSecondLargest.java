package practice;

public class FindSecondLargest {
    public static void main(String[] args){
        int[] arr={1,2,9,8,7,4,5,6};
        int firstMax=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>firstMax){
                secondMax=firstMax;
                firstMax=i;
            } else if (i>secondMax && i!=firstMax) {
                secondMax=i;
            }
        }
        System.out.println(firstMax+" "+secondMax);
    }
}
