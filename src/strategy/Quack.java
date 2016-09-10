package strategy;

public class Quack implements QuackBehavior {
    @Override
    public String quackMessage() {
        return "Quack!";
    }
}
