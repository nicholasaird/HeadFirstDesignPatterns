package decorator;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        super(beverage);

        description = "Mocha";
        cost = new Cents(20);
    }
}
