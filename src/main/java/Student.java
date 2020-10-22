import java.util.ArrayList;

public class Student {
    public String name;
    public long id;
    public ArrayList<Integer> grades;

    public Student(String name, long id) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }

    public long getID() {
        return this.id;
    }

    public String getName() {
        return this.name = name;
    }

    public void addGrade(int i) {
        grades.add(i);
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public double getGradeAverage() {
        int sum = 0;
        for (int grade : grades)
            sum += grade;
        return (double) sum / grades.size();
    }
}
