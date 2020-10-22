import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    private static Student a;
    static ArrayList<Integer> list;

    @BeforeAll
    public static void setUp() {
        a = new Student("lucy", 1L);
        list = new ArrayList<>();
    }

    @Test
    public void testStudentConstructor() {
        Student b = null;
        assertNull(b);
        assertNotNull(a);
        assertEquals("lucy", a.name);
        assertEquals(1L, a.id);
//        assertSame(new ArrayList<>(), a.grades);
//        assertEquals(new ArrayList<>(), a.grades);
    }

    @Test
    public void testGetIdMethod() {
        assertEquals(1L, a.getID());
    }

    @Test
    public void testGetNameMethod() {
        assertEquals("lucy", a.getName());
    }

    @Test
    public void testAddGradeMethod() {
        a.addGrade(60);
        assertEquals(60, a.getGrades().get(0));
    }

    @Test
    public void testGetGradesMethod() {
        assertEquals(a.grades, a.getGrades());
    }

    @Test
    public void testGetGradeAverage() {
        a.addGrade(80);
        a.addGrade(100);
        assertEquals(80.0, a.getGradeAverage(), 0);
        a.addGrade(99);
        assertEquals(84.75, a.getGradeAverage(), 0.1);
    }
//
//    @Test
//    public void testUpdateGrade() {
//
//    }

//    @Test
//    public void testDeleteGrade() {
//        System.out.println(a.getGrades());
//        a.deleteGrade(80);
//        assertEquals(list, a.getGrades());
//    }
}
