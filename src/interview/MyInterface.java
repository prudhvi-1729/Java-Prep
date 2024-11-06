package interview;

public interface MyInterface {
    private String namemyData(){
        return "My Interface";
    };

    public default String myData(){
        return "My Interface";
    };
}
