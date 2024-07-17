package java8features;

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

    }
}
