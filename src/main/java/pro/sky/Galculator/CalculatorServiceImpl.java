package pro.sky.Galculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    public String greet() {
        return "<big>Добро пожаловать в калькулятор</big>";
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }


    public double multiply(double a, double b) {
        return a * b;
    }


    public double divide(double a, double b) {
        return a / b;
    }
}
