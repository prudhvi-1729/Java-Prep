package verizon;

public class StringReverse {
    public static void main(String[] args){
        String sentence="hello baby! how are you";
        String reverseString ="";
        //using String builder
        //StringBuilder sb = new StringBuilder(sentence);
        //System.out.println(sb.reverse());

        for(int i=sentence.length()-1;i>=0;i--){
            reverseString+=sentence.charAt(i);
        }
        System.out.println(reverseString);
    }
}
