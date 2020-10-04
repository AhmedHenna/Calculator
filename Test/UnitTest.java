import com.company.Calculation;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UnitTest {

    @Test
    public void testAddition(){
        UnitTest first = new UnitTest();
        assertEquals(9, Calculation.addition(5, 4));
    }
    @Test
    public void testSubtraction(){
        UnitTest second = new UnitTest();
        assertEquals(1, Calculation.subtraction(5, 4));
    }

    @Test
    public void testDivision(){
        UnitTest third = new UnitTest();
        assertEquals(5, Calculation.division(10, 2));
    }

    @Test
    public void testMultiplication(){
        UnitTest fourth = new UnitTest();
        assertEquals(20, Calculation.multiplication(5, 4));
    }


}
