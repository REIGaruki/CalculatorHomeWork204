package pro.sky.Galculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/calculator")
public class CalculatorController {
    private final CalculatorInterface calculatorService;

    public CalculatorController(CalculatorInterface calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping
    public String greet() {
        return calculatorService.greet();
    }
    @GetMapping(path="/plus")
    public String add(@RequestParam(value = "num1", required = true) double a,
                      @RequestParam(value = "num2", required = true) double b) {
        return "<big>" + a + " + " + b + " = " + calculatorService.add(a, b) + "</big>";
    }
    @GetMapping(path="/minus")
    public String subtract(@RequestParam(value = "num1", required = true) double a,
                           @RequestParam(value = "num2", required = true) double b) {
        return "<big>" + a + " - " + b + " = " + calculatorService.subtract(a, b) + "</big>";
    }
    @GetMapping(path="/multiply")
    public String multiply(@RequestParam(value = "num1", required = true) double a,
                           @RequestParam(value = "num2", required = true) double b) {
        return "<big>" + a + " * " + b + " = " + calculatorService.multiply(a, b) + "</big>";
    }
    @GetMapping(path="/divide")
    public String divide(@RequestParam(value = "num1", required = true) double a,
                         @RequestParam(value = "num2", required = true) double b) {
        if (b == 0) {
            return "<big>Деление на ноль недопустимо</big>";
        } else {
            return "<big>" + a + " / " + b + " = " + calculatorService.divide(a, b) + "</big>";
        }
    }
}
