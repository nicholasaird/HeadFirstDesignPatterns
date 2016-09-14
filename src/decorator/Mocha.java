package decorator;

import helper.Cents;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        super(beverage);

        description = "Mocha";
        cost = new Cents(20);
    }
}
