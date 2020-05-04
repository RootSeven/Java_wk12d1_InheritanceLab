import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director1;

    @Before
    public void before(){
        director1 = new Director("Polly", "D4", 60000, "management", 1000000);
    }

    @Test
    public void canGetName(){
        assertEquals("Polly", director1.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals("D4", director1.getNI());
    }

    @Test
    public void canGetSalary(){
        assertEquals(60000, director1.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        director1.raiseSalary(100);
        assertEquals(60100, director1.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(1200, director1.payBonus(), 0.01);
    }

    @Test
    public void canGetDepartment(){
        assertEquals("management", director1.getDeptName());
    }

    @Test
    public void canGetBudget(){
        assertEquals(1000000, director1.getBudget(), 0.01);
    }

    @Test
    public void cannotSetNameToEmpty(){
        director1.setName("");
        assertEquals("Polly", director1.getName());
    }


}
