package pro.sky.Galculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping
    public String greet() {
        return calculatorService.greet();
    }
    @GetMapping(path="/plus")
    public String add(@RequestParam(value = "num1", required = false) String num1,
                      @RequestParam(value = "num2", required = false) String num2) {
        if (num1 == null || num2 == null) {
            return "<big>Не введены параметры</big>";
        } else {
            double a = Double.parseDouble(num1);
            double b = Double.parseDouble(num2);
            return "<big>" + a + " + " + b + " = " + calculatorService.add(a, b) + "</big>";
        }
    }
    @GetMapping(path="/minus")
    public String subtract(@RequestParam(value = "num1", required = false) String num1,
                           @RequestParam(value = "num2", required = false) String num2) {
        if (num1 == null || num2 == null) {
            return "<big>Не введены параметры</big>";
        } else {
            double a = Double.parseDouble(num1);
            double b = Double.parseDouble(num2);
            return "<big>" + a + " - " + b + " = " + calculatorService.subtract(a, b) + "</big>";
        }
    }
    @GetMapping(path="/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) String num1,
                           @RequestParam(value = "num2", required = false) String num2) {
            if (num1 == null || num2 == null) {
                return "<big>Не введены параметры</big>";
            } else {
                double a = Double.parseDouble(num1);
                double b = Double.parseDouble(num2);
                return "<big>" + a + " * " + b + " = " + calculatorService.multiply(a, b) + "</big>";
            }
    }
    @GetMapping(path="/divide")
    public String divide(@RequestParam(value = "num1", required = false) String num1,
                         @RequestParam(value = "num2", required = false) String num2) {
        if (num1 == null || num2 == null) {
            return "<big>Не введены параметры</big>";
        } else if (Double.parseDouble(num2) == 0) {
            return "<big>Деление на ноль недопустимо</big>";
        } else {
            double a = Double.parseDouble(num1);
            double b = Double.parseDouble(num2);
            return "<big>" + a + " / " + b + " = " + calculatorService.divide(a, b) + "</big>";
        }
    }
}
