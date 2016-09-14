package factory;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) throws UnknownPizzaTypeException {
        switch (type) {
            case "cheese":
                return new NYCheesePizza();
            case "veggie":
                return new NYVeggiePizza();
            case "pepperoni":
                return new NYPepperoniPizza();
            default:
                throw new UnknownPizzaTypeException(
                        "Unknown pizza type <" + type + ">");
        }
    }
}
