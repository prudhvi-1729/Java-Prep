package interview;

import generic.MyClass;

import java.lang.reflect.Field;


public class PrivateField {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        MyClass instance = new MyClass("prudhvi",1);
        Field privateField = MyClass.class.getDeclaredField("id");
        privateField.setAccessible(true);
        int value = (int) privateField.get(instance);
        System.out.println("Value of private field: " + value);

        MyClass instance2 = new MyClass("tanmai",1);
        Field privateField2 = MyClass.class.getDeclaredField("name");
        privateField2.setAccessible(true);
        String value2 = (String) privateField2.get(instance2);
        System.out.println("Value of private field: " + value2);

        //
    }
}
