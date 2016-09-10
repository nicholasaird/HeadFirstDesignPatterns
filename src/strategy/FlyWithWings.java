package strategy;

public class FlyWithWings implements FlyBehavior {
    @Override
    public String flyMessage() {
        return "It flies away!";
    }
}
