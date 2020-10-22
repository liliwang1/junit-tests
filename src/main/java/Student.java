import java.util.ArrayList;

public class Student {
    public String name;
    public long id;
    public ArrayList<Object> grades;

    public Student(String name, long id) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }
}
