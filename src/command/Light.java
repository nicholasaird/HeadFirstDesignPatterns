package command;

public class Light {
    private boolean on;

    public Light() {
        on = false;
    }

    public void on() {
        on = true;
    }

    public void off() {
        on = false;
    }

    public boolean isOn() {
        return on;
    }
}
