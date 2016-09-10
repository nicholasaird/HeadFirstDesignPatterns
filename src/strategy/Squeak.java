package strategy;

public class Squeak implements QuackBehavior {
    @Override
    public String quackMessage() {
        return "Squeak!";
    }
}
