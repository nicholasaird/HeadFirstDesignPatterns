package command;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class LightOnCommandTest {
    @Test
    public void testExecute() {
        Light light = mock(Light.class);
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        lightOnCommand.execute();

        verify(light).on();
    }

    @Test
    public void testExecuteTwice() {
        Light light = mock(Light.class);
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        lightOnCommand.execute();
        lightOnCommand.execute();

        verify(light, times(2)).on();
    }
}
