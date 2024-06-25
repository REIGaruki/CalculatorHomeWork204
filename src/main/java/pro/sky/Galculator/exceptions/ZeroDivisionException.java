package pro.sky.Galculator.exceptions;

public class ZeroDivisionException extends IllegalArgumentException{
    public ZeroDivisionException() {
        System.out.println("Division by zero");
    }
}
