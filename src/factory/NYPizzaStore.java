package factory;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) throws UnknownPizzaTypeException {
        if (type.equals("cheese")) {
            return new NYCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYVeggiePizza();
        } else if (type.equals("pepperoni")) {
            return new NYPepperoniPizza();
        } else {
            throw new UnknownPizzaTypeException(
                    "Unknown pizza type <" + type + ">");
        }
    }
}
