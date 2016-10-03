package adapter;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class TurkeyAdapterTest {
    @Test
    public void testQuackShouldGobble() {
        Turkey turkey = mock(Turkey.class);
        when(turkey.gobble()).thenReturn("Gobble");
        Duck adaptedTurkey = new TurkeyAdapter(turkey);

        String quackMessage = adaptedTurkey.quack();

        assertEquals("Gobble", quackMessage);
    }

    @Test
    public void testFlyShouldFlap() {
        Turkey turkey = mock(Turkey.class);
        when(turkey.fly()).thenReturn("Fly");
        Duck adaptedTurkey = new TurkeyAdapter(turkey);

        String flyMessage = adaptedTurkey.fly();

        assertEquals("Fly", flyMessage);
    }
}
