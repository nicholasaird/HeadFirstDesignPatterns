package helper;

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
            return equals((Cents) other);
        }

        return false;
    }

    private boolean equals(Cents other) {
        return cents == other.cents;
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
