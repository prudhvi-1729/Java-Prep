package practice;

import java.util.Arrays;

import java.util.PriorityQueue;
import java.util.Collections;
public class KLargest {
    public static int findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : arr) {
            minHeap.add(num);
        }
        System.out.println(minHeap);
        for (int i = 1; i < k; i++) {
            System.out.println(minHeap.poll());
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 2;
        System.out.println(k+"th largest element is " + findKthLargest(arr, k)); // Output: 7
    }
}