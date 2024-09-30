import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.algonquin.cst8288.fall24.assignment1.patient.Inpatient;
import com.algonquin.cst8288.fall24.assignment1.patient.Patient;

import java.time.LocalDate;

public class PatientTest {
    private Patient patient;

    @Before
    public void setUp() {
        LocalDate birthDate = LocalDate.of(2000, 1, 1);
        patient = new Inpatient("1", "John Doe", "john@example.com", "1234567890", birthDate, "Room 101");
    }

    @Test
    public void testGetAge() {
        assertEquals(24, patient.getAge()); // Assuming current year is 2024
    }

    @Test
    public void testSetPlannedTreatment() {
        patient.setPlannedTreatment("Flu");
        assertEquals("Flu", patient.getPlannedTreatment());
    }
}
