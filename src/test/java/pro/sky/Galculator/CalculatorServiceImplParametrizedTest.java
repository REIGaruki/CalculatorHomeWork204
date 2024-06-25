package pro.sky.Galculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.Galculator.exceptions.NoParamException;
import pro.sky.Galculator.exceptions.ZeroDivisionException;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplParametrizedTest {
    private final CalculatorService sut = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void add(String a, String b, String expected) {
        String actual = sut.add(a,b);
        assertEquals(expected,actual);
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void addNoParam(String a, String b) {
        assertThrows(NoParamException.class, () -> sut.add(a,b));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void subtract(String a, String b, String expected) {
        String actual = sut.subtract(a,b);
        assertEquals(expected,actual);
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void subtractNoParam(String a, String b) {
        assertThrows(NoParamException.class, () -> sut.subtract(a,b));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void multiply(String a, String b, String expected) {
        String actual = sut.multiply(a,b);
        assertEquals(expected,actual);
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void multiplyNoParam(String a, String b) {
        assertThrows(NoParamException.class, () -> sut.multiply(a,b));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void divide(String a, String b, String expected) {
        String actual = sut.divide(a,b);
        assertEquals(expected,actual);
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void divideNoParam(String a, String b) {
        assertThrows(NoParamException.class, () -> sut.divide(a,b));
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void divideByZero(String a, String b) {
        assertThrows(ZeroDivisionException.class, () -> sut.divide(a,b));
    }
    public static Stream<Arguments> provideParamsForTests() {
        return Stream.of(
                Arguments.of("15","3","<big>15 + 3 = 18</big>"),
                Arguments.of("15","3","<big>15 - 3 = 12</big>"),
                Arguments.of("15","3","<big>15 * 3 = 45</big>"),
                Arguments.of("15","3","<big>15 / 3 = 5</big>"),
                Arguments.of("15","0","<big>15 / 0 = error</big>"),
                Arguments.of(null,"3","<big>null + 3 = 3</big>"),
                Arguments.of("15",null,"<big>15 + null = 15</big>"),
                Arguments.of(null,null,"<big>null + null = null</big>"),
                Arguments.of(null,"0","<big>null / 0 = error</big>")
        );
    }

}