package interview;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PassByValue {

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<Integer>(List.of(1,2,3,4,5));
        System.out.println(a);
        returnValue(a);
        System.out.println(a);
    }

    private static void returnValue(List<Integer> a) {
        a.add(11);
    }

}
