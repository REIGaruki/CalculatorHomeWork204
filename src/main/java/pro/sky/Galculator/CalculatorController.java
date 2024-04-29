package pro.sky.Galculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorInterface calculatorService;

    public CalculatorController(CalculatorInterface calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping(path="/calculator")
    public String greet() {
        return calculatorService.greet();
    }
    @GetMapping(path="/calculator/plus")
    public String add(@RequestParam(value = "num1", required = true) double a,
                      @RequestParam(value = "num2", required = true) double b) {
        return a + " + " + b + " = " + calculatorService.add(a, b);
    }
    @GetMapping(path="/calculator/minus")
    public String subtract(@RequestParam(value = "num1", required = true) double a,
                           @RequestParam(value = "num2", required = true) double b) {
        return a + " - " + b + " = " + calculatorService.subtract(a, b);
    }
    @GetMapping(path="/calculator/multiply")
    public String multiply(@RequestParam(value = "num1", required = true) double a,
                           @RequestParam(value = "num2", required = true) double b) {
        return a + " * " + b + " = " + calculatorService.multiply(a, b);
    }
    @GetMapping(path="/calculator/divide")
    public String divide(@RequestParam(value = "num1", required = true) double a,
                         @RequestParam(value = "num2", required = true) double b) {
        if (b == 0) {
            return "Division by zero Error";
        } else {
            return a + " / " + b + " = " + calculatorService.divide(a, b);
        }
    }
}
