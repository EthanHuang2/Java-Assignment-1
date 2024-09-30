import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.algonquin.cst8288.fall24.assignment1.patient.Inpatient;

import java.time.LocalDate;

public class InpatientTest {
    private Inpatient inpatient;

    @Before
    public void setUp() {
        LocalDate birthDate = LocalDate.of(2000, 1, 1);
        inpatient = new Inpatient("1", "John Doe", "john@example.com", "1234567890", birthDate, "Room 101");
    }

    @Test
    public void testInpatientConstructor() {
        assertEquals("Room 101", inpatient.getRoomNumber());
    }
}
