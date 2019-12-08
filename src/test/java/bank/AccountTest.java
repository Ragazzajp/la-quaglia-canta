package bank;
import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest {

    @Test
    public void movements() {

        Account a = new Account(5432);
        assertEquals(0.0, a.balance(), 0.001);

        Movement m1 = new Movement(1234, 30.0, "Dinner", 13, 11, 2019);
        Movement m2 = new Movement(1235, 10.0, "Cafe", 14, 11, 2019);
        Movement m3 = new Movement(1236, 2100.0, "Salary", 27, 11, 2019);

        a.addInMovement(m3);
        a.addOutMovement(m2);
        a.addOutMovement(m1);

        assertEquals(2100-30-10, a.balance(), 0.001);
        assertEquals(1, a.getInMovements().size());
        assertEquals(2, a.getOutMovements().size());
       }
}