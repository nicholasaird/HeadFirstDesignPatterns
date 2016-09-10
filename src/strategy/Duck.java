package strategy;

public abstract class Duck {
    protected FlyBehavior flyBehavior = new FlyWithWings();
    protected QuackBehavior quackBehavior = new Quack();

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

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
