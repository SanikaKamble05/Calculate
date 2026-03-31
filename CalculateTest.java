import org.junit.Assert;
import org.junit.Test;

public class CalculateTest {

    Calculate calc = new Calculate();

    @Test
    public void testAddition() {
        Assert.assertEquals(15, calc.add(10, 5));
    }

    @Test
    public void testSubtraction() {
        Assert.assertEquals(5, calc.subtract(10, 5));
    }

    @Test
    public void testMultiplication() {
        Assert.assertEquals(50, calc.multiply(10, 5));
    }

    @Test
    public void testDivision() {
        Assert.assertEquals(2, calc.divide(10, 5));
    }
}