package problemsolving;

public class Palindrome {
    public static void main(String[] args){
        String st="123454321";
        StringBuilder sb = new StringBuilder(st);
        System.out.println(sb.toString().equals(sb.reverse().toString()));
    }
}
