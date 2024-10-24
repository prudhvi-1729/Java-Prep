package java21features;

public class StringBuilderRepeat {

    public static void main(String[] args) {
        String data="Hello ";
        StringBuilder sb1 = new StringBuilder(data);
        sb1.repeat(42, 10);
        System.out.println(sb1.toString());
        sb1.repeat("-=", 20);
        System.out.println(sb1.toString());
    }
}
