package decorator;

import static org.junit.Assert.assertEquals;
import static test.TestHelper.assertNotEquals;

import org.junit.Test;

public class CentsTest {
    @Test
    public void testEqualZero() {
        assertEquals(new Cents(0), new Cents(0));
    }

    @Test
    public void testEqualDollar() {
        assertEquals(new Cents(100), new Cents(100));
    }

    @Test
    public void testNotEqualZero() {
        assertNotEquals(new Cents(0), new Cents(1));
    }

    @Test
    public void testNotEqualCent() {
        assertNotEquals(new Cents(1), new Cents(2));
    }

    @Test
    public void testAddCents() {
        assertEquals(new Cents(2), new Cents(1).add(new Cents(1)));
    }
}
