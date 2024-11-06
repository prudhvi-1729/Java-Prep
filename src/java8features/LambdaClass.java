package java8features;

import java.util.random.RandomGenerator;

public class LambdaClass {
    public static void main(String[] args){
        //with void return type
        MyInterVoid myInter = ()->System.out.println("This is my own lamdba function");
        myInter.myFunc();

        //with return type int
        MyInterInt mySum = (a,b)-> {
            return a+b;
        };

        System.out.println(mySum.eval(4,5));

        MyInterInt area = (a,b)-> a*b;
        System.out.println("area of square "+area.eval(4,4));

        RandomGenerator generator = RandomGenerator.of("L32X64MixRandom");
        int randomInt = generator.nextInt(100);
        System.out.println(randomInt);

    }
}
