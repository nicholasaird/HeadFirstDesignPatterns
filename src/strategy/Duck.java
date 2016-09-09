package strategy;

public abstract class Duck {
    protected FlyBehavior flyBehavior = new DefaultFlyBehavior();
    protected QuackBehavior quackBehavior = new DefaultQuackBehavior();

    public Duck() {
        //
    }

    public abstract String displayMessage();

    public String flyMessage() {
        return flyBehavior.flyMessage();
    }

    public String quackMessage() {
        return quackBehavior.quackMessage();
    }

    public String swimMessage() {
        return "All ducks float, even decoys!";
    }
}
