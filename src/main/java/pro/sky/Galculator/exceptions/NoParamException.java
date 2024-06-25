package pro.sky.Galculator.exceptions;

public class NoParamException extends IllegalArgumentException{
    public NoParamException() {
        System.out.println("Required param(s) absence");
    }
}
