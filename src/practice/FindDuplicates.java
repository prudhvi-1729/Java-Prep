package practice;
import java.util.HashSet;

public class FindDuplicates {
     public static void findDuplicates(int[] arr) {
            HashSet<Integer> seen = new HashSet<>();
            HashSet<Integer> duplicates = new HashSet<>();

            System.out.println(seen);
            for (int num : arr) {
                if (!seen.add(num)) {
                    duplicates.add(num);
                }
            }

            if (duplicates.isEmpty()) {
                System.out.println("No duplicates found.");
            } else {
                System.out.println("Duplicates: " + duplicates);
            }
        }

        public static void main(String[] args) {
            int[] arr = {4, 2, 7, 1, 3, 2, 4, 8, 3};
            findDuplicates(arr);
        }

}
