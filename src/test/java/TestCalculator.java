import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCalculator {

    StringCalculator calc;
    @Test
    public void testEmptyString() {
        int result = calc.add("");
        assertEquals(0, result);
    }
     @Test
     public void TestOneEmpty() {
            int result = calc.add("");
            assertEquals(7, result);
        }
     @Test
     public void TestOneEmpty() {
                int result = calc.add("3+5");
                assertEquals(8,result);
    }
}
