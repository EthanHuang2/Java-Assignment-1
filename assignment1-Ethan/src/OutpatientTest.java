import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.algonquin.cst8288.fall24.assignment1.patient.Outpatient;

import java.time.LocalDate;

public class OutpatientTest {
    private Outpatient outpatient;

    @Before
    public void setUp() {
        LocalDate birthDate = LocalDate.of(2005, 1, 1);
        outpatient = new Outpatient("2", "Jane Doe", "jane@example.com", "0987654321", birthDate, "2024-10-01");
    }

    @Test
    public void testOutpatientConstructor() {
        assertEquals("2024-10-01", outpatient.getAppointmentDate());
    }
}
