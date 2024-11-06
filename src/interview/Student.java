package interview;

class Student implements Cloneable {
    private int rollNo;
    private String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            Student original = new Student(101, "Alice");
            Student cloned = (Student) original.clone();

            cloned.name="Prudhvi";

            System.out.println("Original: " + original);
            System.out.println("Cloned: " + cloned);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }
}

