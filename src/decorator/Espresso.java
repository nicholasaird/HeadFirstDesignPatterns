package decorator;

import helper.Cents;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
        cost = new Cents(199);
    }
}
