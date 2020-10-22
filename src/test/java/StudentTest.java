import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testStudentConstructor() {
        Student a = new Student("lucy", 1);
        assertNotNull(a);
        assertEquals("lucy", a.name);
        assertEquals(1, a.id);
//        assertSame(new ArrayList<>(), a.grades);
        assertEquals(new ArrayList<>(), a.grades);
    }


}
