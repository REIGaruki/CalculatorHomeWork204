package pro.sky.Galculator;

public class CalculatorService implements CalculatorInterface{
    @Override
    public String greet() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplicate(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        return a / b;
    }
}
