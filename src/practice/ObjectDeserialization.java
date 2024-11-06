package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectDeserialization {
    public static void main(String[] args) {
        ObjectSerialization myObject = null;

        try (FileInputStream fileIn = new FileInputStream("myObject.txt");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            myObject = (ObjectSerialization) in.readObject();
            System.out.println("Deserialized MyClass...");
            System.out.println("ID: " + myObject.getId());
            System.out.println("Name: " + myObject.getName());
            byte[] data = "Hello, World!".getBytes();
            System.out.println(new String(data));
        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
        }
    }
}
