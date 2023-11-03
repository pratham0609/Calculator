import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class CalculatorTest {
    private Main calc;
    @Before
    public void setUp() {
        calc = new Main();
    }
    @Test
    public void test_squareRoot() {
        double val = 16.0;
        double expectedResult = 4.0;
        double result = calc.squareRoot(val);
        Assert.assertEquals(expectedResult, result, 0.0f);
    }

    @Test
    public void test_factorial() {
        int a = 5;
        int expectedResult = 120;
        int result = calc.factorial(a);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void test_naturalLog() {
        double a = 2.718;
        double expectedResult = 1.0;
        double result = calc.naturalLog(a);
        Assert.assertEquals(expectedResult, result, 0.2f);
    }

    @Test
    public void test_power() {
        double a = 2.0;
        double b = 5.0;
        double expectedResult = 32.0;
        double result = calc.power(a,b);
        Assert.assertEquals(expectedResult, result, 0.0f);
    }
}