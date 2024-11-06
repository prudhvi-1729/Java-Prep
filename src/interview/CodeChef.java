package interview;
class Super {
    int var1 = 5;
    public static void method1(){System.out.println("Super");}
}

class Sub extends Super {
    int var1 = 4;

    public static void method1(){System.out.println("Sub");}
}

public class CodeChef {
    public static void main(String[] args){
        Super sup = new Sub();

        // what will be the output
        System.out.println(sup.var1);
        sup.method1();
    }
}
