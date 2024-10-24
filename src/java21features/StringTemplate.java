package java21features;

public class StringTemplate {

    public static void main(String[] args) {
        //before java 21
        String name = "Prudhvi";
        String message = String.format("Hello %s", name);
        System.out.println(message);

//        after java 21
//        int age = 30;
//        String greeting = `Hello, ${name}! You are ${age} years old.`;
//        System.out.println(greeting);

       // this is removed in java 23

        //improved garbage collection algorithm in java 21

    }

}
