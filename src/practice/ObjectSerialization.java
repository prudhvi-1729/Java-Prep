package practice;
import java.io.Serializable;

public class ObjectSerialization implements Serializable{
    private static final long serialVersionUID = 1L; // Recommended for version control
    private int id;
    private String name;

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


