package strategy;

public class MallardDuck extends Duck {

    public MallardDuck() {
         this.flyBehavior = new FlyWithWings();
         this.quackBehavior = new Quack();
    }

    @Override
    public String displayMessage() {
        return "A Mallard duck";
    }
}
