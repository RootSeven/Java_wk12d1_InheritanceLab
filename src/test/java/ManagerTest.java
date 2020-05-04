import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ManagerTest {

    private Manager manager1;

    @Before
    public void before(){
        manager1 = new Manager("Bill", "A1", 30000, "finance");
    }

    @Test
    public void canGetName(){
        assertEquals("Bill", manager1.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals("A1", manager1.getNI());
    }

    @Test
    public void canGetSalary(){
        assertEquals(30000, manager1.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("finance", manager1.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager1.raiseSalary(100);
        assertEquals( 30100, manager1.getSalary(), 0.01 );
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(300, manager1.payBonus(), 0.01 );
    }

    @Test
    public void cannotSetNameToEmpty(){
        manager1.setName("");
        assertEquals("Bill", manager1.getName());
    }

}
