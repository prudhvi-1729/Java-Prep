package generic;

public class MyClass{
    private String name;
    private int id;

    public MyClass(String name, int id){
        this.name = name;
        this.id = id;
    }

    private String concatMyClass(){
        return name+id;
    }



    public void printMyClass(String name){
        System.out.println("My class name is: "+name);
    }

}
