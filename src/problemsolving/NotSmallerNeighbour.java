package problemsolving;

public class NotSmallerNeighbour {
    int[] resultArr = new int[]{}; // Issue 1: Initialize the array with a specific size

    public int[] notSmallerNeighbour(int[] array) {
        int c = 0;
        for (int i = 1; i < array.length - 1; i++) { // Issue 2: Adjust the loop range
            if (array[i - 1] < array[i] && array[i + 1] < array[i]) {
                // Issue 3: You can't assign to an uninitialized array
                // Create a new array with the updated size
                int[] tempArr = new int[resultArr.length + 1];
                System.arraycopy(resultArr, 0, tempArr, 0, resultArr.length);
                tempArr[c] = array[i];
                resultArr = tempArr;
                c++;
            }
        }
        return resultArr;
    }

    public static void main(String[] args) {
        NotSmallerNeighbour obj = new NotSmallerNeighbour();
        int[] arr = new int[]{10, 20, 15, 2, 23, 90, 67};
        int[] result = obj.notSmallerNeighbour(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
