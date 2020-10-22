import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    private static Student a;
    static ArrayList<Integer> list;

    @BeforeAll
    public static void setUp() {
        a = new Student("lucy", 1);
        list = new ArrayList<>();
    }

    @Test
    public void testStudentConstructor() {
        assertNotNull(a);
        assertEquals("lucy", a.name);
        assertEquals(1, a.id);
//        assertSame(new ArrayList<>(), a.grades);
//        assertEquals(new ArrayList<>(), a.grades);
    }

    @Test
    public void testGetIdMethod() {
        assertEquals(1, a.getID());
    }

    @Test
    public void testGetNameMethod() {
        assertEquals("lucy", a.getName());
    }

    @Test
    public void testAddGradeMethod() {
        list.add(60);
        a.addGrade(60);
        assertEquals(list, a.grades);
    }

    @Test
    public void testGetGradesMethod() {
        assertEquals(a.grades, a.getGrades());
    }

    @Test
    public void testGetGradeAverage() {
        a.addGrade(80);
        a.addGrade(100);
        list.add(80);
        list.add(100);
        assertEquals(list,a.getGrades());
        assertEquals(list.size(),a.getGrades().size());
        assertEquals(80.0, a.getGradeAverage());
    }

}
