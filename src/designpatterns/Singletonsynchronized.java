package designpatterns;

public class Singletonsynchronized {

    //for thread safe operations

    private static Singletonsynchronized instance;

    private Singletonsynchronized(){}

    public static synchronized Singletonsynchronized getInstance(){
        if(instance==null){
            instance = new Singletonsynchronized();
        }
        return instance;
    }
}
