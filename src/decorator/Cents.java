package decorator;

public class Cents {
    private long cents;

    public Cents(long cents) {
        this.cents = cents;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Cents) {
            Cents money = (Cents) other;
            return cents == money.cents;
        }

        return false;
    }

    // This class isn't made to use a hashcode
    @Override
    public int hashCode() {
        assert false : "hashCode not designed";
        return 42; // Any arbitrary constant will do
    }

    public Cents add(Cents money) {
        return new Cents(cents + money.cents);
    }

    @Override
    public String toString() {
        return "Money(" + cents + " cents)";
    }
}
