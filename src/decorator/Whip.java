package decorator;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        super(beverage);

        description = "Whip";
        cost = new Cents(10);
    }
}
