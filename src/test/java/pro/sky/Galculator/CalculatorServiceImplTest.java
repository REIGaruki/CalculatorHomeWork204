package pro.sky.Galculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.Galculator.exceptions.NoParamException;

public class CalculatorServiceImplTest {
    private final CalculatorService out = new CalculatorServiceImpl();
    @Test
    public void additionTest() {
        String a = "3";
        String b = "5";
        String expected = "<big>3 + 5 = 8</big>";
        String actual = out.add(a,b);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void additionWithNoParamTest() {
        String a = "0";
        String b = null;
        Assertions.assertThrows(NoParamException.class, () -> out.add(a,b));
        Assertions.assertThrows(NoParamException.class, () -> out.add(b,a));
        Assertions.assertThrows(NoParamException.class, () -> out.add(b,b));
    }

}
