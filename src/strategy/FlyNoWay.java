package strategy;

public class FlyNoWay implements FlyBehavior {
    @Override
    public String flyMessage() {
        return "It can't fly!";
    }
}
