package verizon;

import java.util.HashMap;

public class DuplicateCharacter {
    public static void main(String[] args){
        String sentence = "JavaJavaEE";
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c: sentence.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        System.out.println(map);
    }
}
