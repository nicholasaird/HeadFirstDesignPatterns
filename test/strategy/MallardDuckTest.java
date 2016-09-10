package strategy;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MallardDuckTest {
    private MallardDuck mallardDuck;

    @Before
    public void setUp() {
        mallardDuck = new MallardDuck();
    }

    @After
    public void tearDown() {
        mallardDuck = null;
    }

    @Test
    public void testDisplayMessage() {
        assertEquals("A Mallard duck", mallardDuck.displayMessage());
    }

    @Test
    public void testQuackMessage() {
        assertEquals("Quack!", mallardDuck.quackMessage());
    }

    @Test
    public void testSwimMessage() {
        assertEquals("All ducks float, even decoys!", mallardDuck.swimMessage());
    }

    @Test
    public void testFlyMessage() {
        assertEquals("It flies away!", mallardDuck.flyMessage());
    }
}
