package command;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;

public class RemoteControlTest {
    private RemoteControl remoteControl;

    @Before
    public void setUp() {
        remoteControl = new RemoteControl();
    }

    @Test
    public void testOneCommandWithoutExecution() {
        Command command1On = mock(Command.class);
        Command command1Off = mock(Command.class);

        remoteControl.setCommand(0, command1On, command1Off);

        verify(command1On, times(0)).execute();
        verify(command1Off, times(0)).execute();
    }

    @Test
    public void testOnCommandPushedOn() {
        Command command1On = mock(Command.class);
        Command command1Off = mock(Command.class);

        remoteControl.setCommand(0, command1On, command1Off);
        remoteControl.onButtonWasPushed(0);

        verify(command1On).execute();
        verify(command1Off, times(0)).execute();
    }

    @Test
    public void testOnCommandPushedOff() {
        Command command1On = mock(Command.class);
        Command command1Off = mock(Command.class);

        remoteControl.setCommand(0, command1On, command1Off);
        remoteControl.offButtonWasPushed(0);

        verify(command1On, times(0)).execute();
        verify(command1Off).execute();
    }

    @Test
    public void testOneCommandPushedOnAndOff() {
        Command command1On = mock(Command.class);
        Command command1Off = mock(Command.class);

        remoteControl.setCommand(0, command1On, command1Off);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        verify(command1On).execute();
        verify(command1Off).execute();
    }

    @Test
    public void testTwoCommandsWithoutExecution() {
        Command command1On = mock(Command.class);
        Command command1Off = mock(Command.class);
        Command command2On = mock(Command.class);
        Command command2Off = mock(Command.class);

        remoteControl.setCommand(0, command1On, command1Off);
        remoteControl.setCommand(1, command2On, command2Off);

        verify(command1On, times(0)).execute();
        verify(command1Off, times(0)).execute();
        verify(command2On, times(0)).execute();
        verify(command2Off, times(0)).execute();
    }

    @Test
    public void testPressingOnButtonWithoutCommand() {
        remoteControl.onButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
    }

    @Test
    public void testPressingOffButtonWithoutCommand() {
        remoteControl.onButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
    }
}
