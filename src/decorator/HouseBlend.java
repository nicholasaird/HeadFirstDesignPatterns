package decorator;

import helper.Cents;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
        cost = new Cents(89);
    }
}
