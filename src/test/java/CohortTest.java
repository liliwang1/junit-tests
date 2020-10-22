import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CohortTest {

    Cohort cohort;
    Student a;
    Student b;

    @BeforeEach
    public void setUp() {
        cohort = new Cohort();
        a = new Student(1L, "amy");
        b = new Student(2L, "Black");
    }

    @Test
    public void testGetStudents() {
        assertTrue(cohort.getStudents().isEmpty());
    }

    @Test
    public void testAddStudent() {
        assertTrue(cohort.getStudents().isEmpty());

        cohort.addStudent(a);
        assertFalse(cohort.getStudents().isEmpty());
        assertEquals(1, cohort.getStudents().size());
        assertSame(a, cohort.getStudents().get(0));

        cohort.addStudent(b);
        assertEquals(2, cohort.getStudents().size());
        assertSame(b, cohort.getStudents().get(1));
    }

    @Test
    public void testGetCohortAverage() {
        a.addGrade(80);
        a.addGrade(100);
        b.addGrade(90);
        b.addGrade(70);
        cohort.addStudent(a);
        cohort.addStudent(b);
        assertEquals(85, cohort.getCohortAverage(), 0);
        a.addGrade(88);
        assertEquals(84.6, cohort.getCohortAverage(), 0.1);
    }

    @Test
    public void testFindStudentById() {
        cohort.addStudent(a);
        assertEquals(a, cohort.findStudentById(1L));
        cohort.addStudent(b);
        assertEquals(b, cohort.findStudentById(2L));
        assertNull(cohort.findStudentById(3L));
    }
}
