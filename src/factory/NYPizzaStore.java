package factory;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) throws UnknownPizzaTypeException {
        throw new UnknownPizzaTypeException(
                "Unknown pizza type <" + type + ">");
    }
}
