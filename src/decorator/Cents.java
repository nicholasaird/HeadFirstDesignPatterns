package decorator;

public class Cents {
    private long cents;

    public Cents(long cents) {
        this.cents = cents;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }

        if (other instanceof Cents) {
            Cents money = (Cents) other;
            return cents == money.cents;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return (int) cents;
    }

    public Cents add(Cents money) {
        return new Cents(cents + money.cents);
    }

    @Override
    public String toString() {
        return "Money(" + cents + " cents)";
    }
}
