package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {

    public static void main(String[] args) {
        Deque<Character> stack = new ArrayDeque<Character>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        stack.push('e');

        stack.peek();
        stack.isEmpty();
        stack.pop();
        stack.push('f');


    }
}
