package interview;

import generic.MyClass;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectMethod {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        MyClass obj = new MyClass("prudhvi", 24);
        Method myclassMethod = MyClass.class.getDeclaredMethod("concatMyClass");
        myclassMethod.setAccessible(true);
        String result = (String) myclassMethod.invoke(obj);
        System.out.println(result);

        MyClass obj2 = new MyClass("prudhvi", 24);
        Method myclassMethod2 = MyClass.class.getDeclaredMethod("printMyClass", String.class);
        myclassMethod2.setAccessible(true);
        myclassMethod2.invoke(obj2, "tanmai");






    }
}