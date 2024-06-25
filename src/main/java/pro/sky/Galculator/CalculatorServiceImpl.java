package pro.sky.Galculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{

    public String add(String num1, String num2) {
        if (num1 == null || num2 == null) {
            return "<big>Не введены параметры</big>";
        } else {
            double a = Double.parseDouble(num1);
            double b = Double.parseDouble(num2);
            return "<big>" + a + " + " + b + " = " + (a + b) + "</big>";
        }
    }

    public String subtract(String num1, String num2) {
        if (num1 == null || num2 == null) {
            return "<big>Не введены параметры</big>";
        } else {
            double a = Double.parseDouble(num1);
            double b = Double.parseDouble(num2);
            return "<big>" + a + " - " + b + " = " + (a - b) + "</big>";
        }
    }


    public String multiply(String num1, String num2) {
        if (num1 == null || num2 == null) {
            return "<big>Не введены параметры</big>";
        } else {
            double a = Double.parseDouble(num1);
            double b = Double.parseDouble(num2);
            return "<big>" + a + " * " + b + " = " + (a * b) + "</big>";
        }
    }


    public String divide(String num1, String num2) {
        if (num1 == null || num2 == null) {
            return "<big>Не введены параметры</big>";
        } else if (Double.parseDouble(num2) == 0) {
            return "<big>Деление на ноль недопустимо</big>";
        } else {
            double a = Double.parseDouble(num1);
            double b = Double.parseDouble(num2);
            return "<big>" + a + " / " + b + " = " + (a / b) + "</big>";
        }
    }
}
