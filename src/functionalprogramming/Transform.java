package functionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


public class Transform {
    public static void main(String[] args) {
            List<Integer> nums= List.of(1,2,3,4,5);
            List<Integer> squaredNumbers = transformList(nums, n->n*n);

            System.out.println(squaredNumbers);
        }
        public static <T,R> List<R> transformList(List<T> inputList, Function<T,R> transformer){
            List<R> result = new ArrayList<>();
            for (T item : inputList) {
                R transformedItem = transformer.apply(item);
                result.add(transformedItem);
            }
            return result;
        }
}
