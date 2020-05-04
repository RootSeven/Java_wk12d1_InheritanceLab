import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin1;

    @Before
    public void before(){
        databaseAdmin1 = new DatabaseAdmin("Arthur", "B2", 40000 );
    }

    @Test
    public void canGetName(){
        assertEquals("Arthur", databaseAdmin1.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals("B2", databaseAdmin1.getNI());
    }

    @Test
    public void canGetSalary(){
        assertEquals(40000, databaseAdmin1.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin1.raiseSalary(100);
        assertEquals(40100, databaseAdmin1.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(400, databaseAdmin1.payBonus(), 0.01);
    }

    @Test
    public void cannotRaiseSalaryByNegative(){
        databaseAdmin1.raiseSalary(-100);
        assertEquals(40000, databaseAdmin1.getSalary(), 0.01);
    }

    @Test
    public void cannotSetNameToEmpty(){
        databaseAdmin1.setName("");
        assertEquals("Arthur", databaseAdmin1.getName());
    }

}
