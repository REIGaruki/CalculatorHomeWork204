package pro.sky.Galculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.Galculator.exceptions.NoParamException;
import pro.sky.Galculator.exceptions.ZeroDivisionException;

public class CalculatorServiceImplTest {
    private final CalculatorService sut = new CalculatorServiceImpl();
    @Test
    public void additionTest() {
        String a = "3";
        String b = "5";
        String expected = "<big>3 + 5 = 8</big>";
        String actual = sut.add(a,b);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void additionWithNoParamTest() {
        String a = "0";
        String b = null;
        Assertions.assertThrows(NoParamException.class, () -> sut.add(a,b));
        Assertions.assertThrows(NoParamException.class, () -> sut.add(b,a));
        Assertions.assertThrows(NoParamException.class, () -> sut.add(b,b));
    }
    @Test
    public void substractionTest() {
        String a = "3";
        String b = "5";
        String expected = "<big>5 - 3 = 2</big>";
        String actual = sut.subtract(b,a);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void substractionWithNoParamTest() {
        String a = "0";
        String b = null;
        Assertions.assertThrows(NoParamException.class, () -> sut.subtract(a,b));
        Assertions.assertThrows(NoParamException.class, () -> sut.subtract(b,a));
        Assertions.assertThrows(NoParamException.class, () -> sut.subtract(b,b));
    }
    @Test
    public void multiplyTest() {
        String a = "3";
        String b = "5";
        String expected = "<big>3 * 5 = 15</big>";
        String actual = sut.multiply(a,b);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void multiplyWithNoParamTest() {
        String a = "0";
        String b = null;
        Assertions.assertThrows(NoParamException.class, () -> sut.multiply(a,b));
        Assertions.assertThrows(NoParamException.class, () -> sut.multiply(b,a));
        Assertions.assertThrows(NoParamException.class, () -> sut.multiply(b,b));
    }
    @Test
    public void divisionTest() {
        String a = "13";
        String b = "5";
        String expected = "<big>13 / 5 = 2</big>";
        String actual = sut.divide(a,b);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void divisionWithNoParamTest() {
        String a = "0";
        String b = null;
        Assertions.assertThrows(NoParamException.class, () -> sut.divide(a,b));
        Assertions.assertThrows(NoParamException.class, () -> sut.divide(b,a));
        Assertions.assertThrows(NoParamException.class, () -> sut.divide(b,b));
        Assertions.assertThrows(ZeroDivisionException.class, () -> sut.divide(a,a));
    }

}
