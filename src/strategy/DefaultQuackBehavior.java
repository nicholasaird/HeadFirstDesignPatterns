package strategy;

public class DefaultQuackBehavior implements QuackBehavior {
    @Override
    public String quackMessage() {
        return "Default quack";
    }
}
