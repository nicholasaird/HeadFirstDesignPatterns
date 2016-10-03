package adapter;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdapterIntegrationTest {
    @Test
    public void testQuackShouldGobble() {
        Duck adaptedTurkey = new TurkeyAdapter(new Turkey());

        String result = adaptedTurkey.quack();

        assertEquals("Gobble gobble!", result);
    }

    @Test
    public void testFlyShouldFlap() {
        Duck adaptedTurkey = new TurkeyAdapter(new Turkey());

        String result = adaptedTurkey.fly();

        assertEquals("Flap", result);
    }
}
