package decorator;

import helper.Cents;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
        description = "Unknown condiment";
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + description;
    }

    @Override
    public Cents cost() {
        return cost.add(beverage.cost());
    }
}
