package practice;

import java.util.Objects;

public class HashcodeEquals {
    String firstName;
    String lastName;
    Integer age;
    HashcodeEquals(String firstName, String lastName, Integer age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }

    @Override
    public boolean equals(Object o){
        if(this==o){
            return true;
        }
        if(o==null || getClass()!=o.getClass()){
            return false;
        }
        HashcodeEquals person = (HashcodeEquals) o;
        return age==person.age && Objects.equals(firstName,person.firstName) && Objects.equals(lastName,person.lastName);
    }

    @Override
    public int hashCode(){
        return Objects.hash(firstName,lastName,age);
    }

    public static void main(String[] args) {
        HashcodeEquals person1 = new HashcodeEquals("John", "Doe", 30);
        HashcodeEquals person2 = new HashcodeEquals("John", "Doe", 30);

        // Testing equality
        System.out.println("Are person1 and person2 equal? " + person1.equals(person2));

        // Testing hash codes
        System.out.println("Hash code for person1: " + person1.hashCode());
        System.out.println("Hash code for person2: " + person2.hashCode());
    }
}
