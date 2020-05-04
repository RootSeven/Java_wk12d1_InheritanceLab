import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer1;

    @Before
    public void before(){
        developer1 = new Developer("Jill", "C3", 50000);
    }

    @Test
    public void canGetName(){
        assertEquals("Jill", developer1.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals("C3", developer1.getNI());
    }

    @Test
    public void canGetSalary(){
        assertEquals(50000, developer1.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        developer1.raiseSalary(100);
        assertEquals(50100, developer1.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(500, developer1.payBonus(), 0.01);
    }

    @Test
    public void cannotSetNameToEmpty(){
        developer1.setName("");
        assertEquals("Jill", developer1.getName());
    }


}
