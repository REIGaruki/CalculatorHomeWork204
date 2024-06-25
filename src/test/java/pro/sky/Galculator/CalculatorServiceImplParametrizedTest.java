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
    @MethodSource("provideParamsForAdditionTests")
    void add(String a, String b, String expected) {
        String actual = sut.add(a,b);
        assertEquals(expected,actual);
    }
    @ParameterizedTest
    @MethodSource("provideParamsForNoParamTests")
    void addNoParam(String a, String b) {
        assertThrows(NoParamException.class, () -> sut.add(a,b));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForSubstractTests")
    void subtract(String a, String b, String expected) {
        String actual = sut.subtract(a,b);
        assertEquals(expected,actual);
    }
    @ParameterizedTest
    @MethodSource("provideParamsForNoParamTests")
    void subtractNoParam(String a, String b) {
        assertThrows(NoParamException.class, () -> sut.subtract(a,b));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyTests")
    void multiply(String a, String b, String expected) {
        String actual = sut.multiply(a,b);
        assertEquals(expected,actual);
    }
    @ParameterizedTest
    @MethodSource("provideParamsForNoParamTests")
    void multiplyNoParam(String a, String b) {
        assertThrows(NoParamException.class, () -> sut.multiply(a,b));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivisionTests")
    void divide(String a, String b, String expected) {
        String actual = sut.divide(a,b);
        assertEquals(expected,actual);
    }
    @ParameterizedTest
    @MethodSource("provideParamsForNoParamTests")
    void divideNoParam(String a, String b) {
        assertThrows(NoParamException.class, () -> sut.divide(a,b));
    }
    @ParameterizedTest
    @MethodSource("provideParamsForZeroDivisionTests")
    void divideByZero(String a, String b) {
        assertThrows(ZeroDivisionException.class, () -> sut.divide(a,b));
    }
    public static Stream<Arguments> provideParamsForAdditionTests() {
        return Stream.of(
                Arguments.of("15","3","<big>15 + 3 = 18</big>"),
                Arguments.of("3","3","<big>3 + 3 = 6</big>"),
                Arguments.of("152","153","<big>152 + 153 = 305</big>")
        );
    }
    public static Stream<Arguments> provideParamsForSubstractTests() {
        return Stream.of(
                Arguments.of("15","30","<big>15 - 30 = -15</big>"),
                Arguments.of("15","3","<big>15 - 3 = 12</big>"),
                Arguments.of("15","0","<big>15 - 0 = 15</big>")
        );
    }
    public static Stream<Arguments> provideParamsForMultiplyTests() {
        return Stream.of(
                Arguments.of("70","80","<big>70 * 80 = 5600</big>"),
                Arguments.of("15","3","<big>15 * 3 = 45</big>"),
                Arguments.of("15","0","<big>15 * 0 = 0</big>")
        );
    }
    public static Stream<Arguments> provideParamsForDivisionTests() {
        return Stream.of(
                Arguments.of("303","101","<big>303 / 101 = 3</big>"),
                Arguments.of("0","3","<big>0 / 3 = 0</big>"),
                Arguments.of("15","3","<big>15 / 3 = 5</big>")
        );
    }
    public static Stream<Arguments> provideParamsForNoParamTests() {
        return Stream.of(
                Arguments.of(null,"3","<big>null + 3 = 3</big>"),
                Arguments.of("15",null,"<big>15 + null = 15</big>"),
                Arguments.of(null,null,"<big>null + null = null</big>")
        );
    }
    public static Stream<Arguments> provideParamsForZeroDivisionTests() {
        return Stream.of(
                Arguments.of("15","0","<big>15 + null = 15</big>"),
                Arguments.of("0","0","<big>null + null = null</big>")
        );
    }

}