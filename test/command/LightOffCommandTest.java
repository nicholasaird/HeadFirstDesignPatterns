package command;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class LightOffCommandTest {
    @Test
    public void testExecute() {
        Light light = mock(Light.class);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        lightOffCommand.execute();

        verify(light).off();
    }

    @Test
    public void testExecuteTwice() {
        Light light = mock(Light.class);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        lightOffCommand.execute();
        lightOffCommand.execute();

        verify(light, times(2)).off();
    }
}
