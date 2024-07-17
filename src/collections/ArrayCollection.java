package collections;

import java.sql.SQLData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayCollection {
    public static void main(String[] args){
        ArrayList<String> colors_array = new ArrayList<String>();
        colors_array.add("Red");
        colors_array.add("Green");
        colors_array.add("Blue");
        colors_array.add("yellow");
        colors_array.add("White");
        colors_array.add("purple");

        //add at index i
        colors_array.add(1,"pink");

        // Update the third element with "Yellow"
        colors_array.set(2, "purple");

        // Remove the third element from the list.
        //parameter can be object or index
        colors_array.remove(2);

        //colors_array.remove("Red") if string value
        //colors_array.remove(Integer.valueOf(1)) if integer value

        // Search the value Red
        boolean result = colors_array.contains("Red");

        ArrayList<String> List = new ArrayList<String>();

        //shuffle the Arraylist
        Collections.shuffle(List);

        //reverse arraylist
        Collections.reverse(colors_array);

        //sort arrayList
        Collections.sort(colors_array);

        //output :- [Blue, Red, pink, yellow]
        System.out.println("the colors list "+colors_array);


        //Increase capacity of ArrayList to 6
        colors_array.ensureCapacity(6);

        int[] data= {1,2,3,4,5};

        for(int i:data){
            System.out.println(i);
        }

        System.out.println(colors_array);

        //size() is for collections and length is for arrays
        //add,get,remove,set,isEmpty
        for (String s : colors_array) {
            System.out.println(s);
        }

        //addAll to add a new collection, can be added at specific index also
    }
}
