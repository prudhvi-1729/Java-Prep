package verizon;

import java.util.*;

public class DuplicateWords {

    public static void main(String[] args){
        String str = "Hi Hi This is is Prudhvi.,How are are you you";
        List<String> lt = new ArrayList<>();
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        String word ="";
        for(int i=0;i<str.length();i++){
            if(Character.isLetter(str.charAt(i))){
                word+=str.charAt(i);
            }
            else if(Character.isWhitespace(str.charAt(i))){
                lt.add(word);
                word="";
            }


        }
        System.out.println(lt);

        HashMap<String,Integer> hmap = new HashMap<>();
        String resultSentence = "";
        for(String i: lt){
            if(hmap.containsKey(i)){
                hmap.put(i,hmap.get(i)+1);
            }
            else {
                hmap.put(i,1);
                resultSentence+=i+" ";
            }
        }
        System.out.println(hmap.entrySet());
        System.out.println(resultSentence);
    }
}
