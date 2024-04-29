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
        return a + " + " + b + " = " + calculatorService.add(a, b);
    }
    @GetMapping(path="/minus")
    public String subtract(@RequestParam(value = "num1", required = true) double a,
                           @RequestParam(value = "num2", required = true) double b) {
        return a + " - " + b + " = " + calculatorService.subtract(a, b);
    }
    @GetMapping(path="/multiply")
    public String multiply(@RequestParam(value = "num1", required = true) double a,
                           @RequestParam(value = "num2", required = true) double b) {
        return a + " * " + b + " = " + calculatorService.multiply(a, b);
    }
    @GetMapping(path="/divide")
    public String divide(@RequestParam(value = "num1", required = true) double a,
                         @RequestParam(value = "num2", required = true) double b) {
        if (b == 0) {
            return "Деление на ноль недопустимо";
        } else {
            return a + " / " + b + " = " + calculatorService.divide(a, b);
        }
    }
}
