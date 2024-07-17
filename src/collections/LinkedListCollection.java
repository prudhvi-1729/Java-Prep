package collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCollection {

    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Blue");

        // print the list
        System.out.println("The linked list: " + l_list);

        //Swapping 1st(index 0) element with the 3rd(index 2) element
        Collections.swap(l_list, 0, 2);

        // Collections.copy(List, colors_array);
        System.out.println(l_list);

        LinkedList<String> copy_list = new LinkedList<String>();

        copy_list.add("1");
        copy_list.add("2");
        copy_list.add("3");
        copy_list.add("4");
        copy_list.add("5");

        System.out.println(copy_list);

        System.out.println(l_list.get(1));

        // Copy colors-array to List
        Collections.copy(copy_list,l_list);

        System.out.println("copy_list "+copy_list);

        // set Iterator at specified index
        Iterator<String> p = l_list.iterator();

        // print list from second position
        while (p.hasNext()) {
            System.out.println(p.next());
        }

        //linked list in reverse order.
        Iterator<String> it = l_list.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Add an element to front of LinkedList, offerLast
        l_list.offerFirst("Pink");

        //shallow copy(copies references of l_list)
        //this is deep copy
        LinkedList<String> newc1 = new LinkedList <String> ();
        newc1 = (LinkedList) l_list.clone();

        System.out.println(l_list);

        //pops out first element in LinkedList
        System.out.println("Removed element first element in l_list: "+l_list.pop());

        // Removing all the elements from the linked list
        l_list.clear();

        // Retrieve but does not remove, the first element of a linked list
        String x = l_list.peekFirst();

        System.out.println("copy list"+copy_list);

        Collections.reverse(copy_list);

        System.out.println("copy list"+copy_list);

        Collections.shuffle(copy_list);

    }

}
