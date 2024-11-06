package practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectSerializationImpl {
        public static void main(String[] args) {
            ObjectSerialization myObject = new ObjectSerialization();
            myObject.setId(1);
            myObject.setName("Example");

            try (FileOutputStream fileOut = new FileOutputStream("myObject.txt");
                 ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
                out.writeObject(myObject);
                System.out.println("Serialized data is saved in myObject.ser");
            } catch (IOException i) {
                i.printStackTrace();
            }
        }
}
