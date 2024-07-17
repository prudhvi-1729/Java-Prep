package practice;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListCollection {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<String> ll= new LinkedList<String>();
        System.out.println("Enter size of linkedlist: ");
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            ll.add(sc.next());
        }
        System.out.println("original ll "+ll);
        LinkedList<String> ll_copy = (LinkedList<String>) ll.clone();


        System.out.println("copy ll: "+ll_copy);

        ll.set(1,"4");

        System.out.println("original ll "+ll);
        System.out.println("copy "+ll_copy);
        System.out.println("original ll "+ll);
        System.out.println("copy "+ll_copy);

        //returns false
        System.out.println(ll.equals(ll_copy));

        System.out.println("original ll "+ll);

        System.out.println(ll.peekFirst());

        Iterator<String> itr = ll.listIterator(1);

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        LinkedList<String> ll_shallow= new LinkedList<String>();
        ll_shallow.add("1");
        ll_shallow.add("2");
        ll_shallow.add("3");
        Collections.copy(ll_shallow,ll);
        ll.set(1,"7");
        System.out.println(ll_shallow);

    }
}
