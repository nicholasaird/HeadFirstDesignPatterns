package command;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class LightTest {
    private Light light;

    @Before
    public void setUp() {
        light = new Light();
    }

    @Test
    public void testDefaultOff() {
        assertTrue(!light.isOn());
    }

    @Test
    public void testOn() {
        light.on();

        assertTrue(light.isOn());
    }

    @Test
    public void testOff() {
        light.off();

        assertTrue(!light.isOn());
    }

    @Test
    public void testOnTwice() {
        light.on();
        light.on();

        assertTrue(light.isOn());
    }

    @Test
    public void testOffTwice() {
        light.off();
        light.off();

        assertTrue(!light.isOn());
    }
}
