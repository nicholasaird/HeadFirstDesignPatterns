package factory;

public class UnknownPizzaTypeException extends Exception {
    public UnknownPizzaTypeException(String message) {
        super(message);
    }
}
