package pro.sky.Galculator;

import org.springframework.stereotype.Service;
import pro.sky.Galculator.exceptions.NoParamException;
import pro.sky.Galculator.exceptions.ZeroDivisionException;

@Service
public class CalculatorServiceImpl implements CalculatorService{

    public String add(String num1, String num2) {
        throwExceptionIfParamAbsent(num1,num2);
        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        return "<big>" + a + " + " + b + " = " + (a + b) + "</big>";
    }

    public String subtract(String num1, String num2) {
        throwExceptionIfParamAbsent(num1,num2);
        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        return "<big>" + a + " - " + b + " = " + (a - b) + "</big>";
    }

    public String multiply(String num1, String num2) {
        throwExceptionIfParamAbsent(num1, num2);
        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        return "<big>" + a + " * " + b + " = " + (a * b) + "</big>";
    }

    public String divide(String num1, String num2) {
        throwExceptionIfParamAbsent(num1,num2);
        if (Integer.parseInt(num2) == 0) {
            throw new ZeroDivisionException();
        } else {
            int a = Integer.parseInt(num1);
            int b = Integer.parseInt(num2);
            return "<big>" + a + " / " + b + " = " + (a / b) + "</big>";
        }
    }
    private void throwExceptionIfParamAbsent(Object a, Object b) {
        if (a == null || b == null) {
            throw new NoParamException();
        }
    }
}
