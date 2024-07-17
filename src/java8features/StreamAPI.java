package java8features;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args){
        List<String> arr = List.of("prudhvi","laxmi","tanmai");
        List<Integer> numbers = List.of(9,8,7,6,5);
        long count =arr.stream().filter(num -> num.length()>5).count();
        System.out.println(count);

        Stream<String> strings = Stream.of("Geeks", "fOr", "GEEKSQUIZ", "GeeksforGeeks");

        // Get a stream consisting of elements with an uppercase letter at index 1
        strings.filter(str -> Character.isUpperCase(str.charAt(1)))
                .forEach(System.out::println);

        //The filter() operation is lazy—it doesn’t actually perform
        // any filtering until the stream is traversed.

        List<String> list= arr.stream().filter(e->e.startsWith("l")).toList();
        System.out.println("list "+list);

        //stream().sorted().toList()
        //Class::method
        Integer result = numbers.stream().min(Integer::compareTo).get();
        System.out.println(result);
    }
}
