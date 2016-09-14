package decorator;

import helper.Cents;

public abstract class Beverage {
    protected String description = "Unknown beverage";
    protected Cents cost;

    public String getDescription() {
        return description;
    }

    public Cents cost() {
        return cost;
    }
}
