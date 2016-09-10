package strategy;

public class SilentQuack implements QuackBehavior {
    @Override
    public String quackMessage() {
        return "...";
    }
}
