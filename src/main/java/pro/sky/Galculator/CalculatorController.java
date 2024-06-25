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
        return "<big>Добро пожаловать в калькулятор</big>";
    }
    @GetMapping(path="/plus")
    public String add(@RequestParam(value = "num1", required = false) String num1,
                      @RequestParam(value = "num2", required = false) String num2) {
        return calculatorService.add(num1, num2);
    }
    @GetMapping(path="/minus")
    public String subtract(@RequestParam(value = "num1", required = false) String num1,
                           @RequestParam(value = "num2", required = false) String num2) {
        return calculatorService.subtract(num1, num2);
    }
    @GetMapping(path="/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) String num1,
                           @RequestParam(value = "num2", required = false) String num2) {
            return calculatorService.multiply(num1, num2);
    }
    @GetMapping(path="/divide")
    public String divide(@RequestParam(value = "num1", required = false) String num1,
                         @RequestParam(value = "num2", required = false) String num2) {
        return calculatorService.divide(num1, num2);
    }
}
