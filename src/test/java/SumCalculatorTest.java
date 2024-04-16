import org.example.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {
    private SumCalculator sumCalculator;
    @BeforeEach
    public void createObject(){
        sumCalculator = new SumCalculator();
    }
    @Test
    public void oneInParameterShouldReturnOne(){
        int actual = sumCalculator.sum(1);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sumTest(){
        int actual = sumCalculator.sum(3);
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void zeroInParameterShouldThrowException(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }
}
