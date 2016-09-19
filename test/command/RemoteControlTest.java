package command;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;

public class RemoteControlTest {
    private RemoteControl remoteControl;
    private Command commandAOn;
    private Command commandAOff;
    private Command commandBOn;
    private Command commandBOff;

    @Before
    public void setUp() {
        remoteControl = new RemoteControl();

        commandAOn = mock(Command.class);
        commandAOff = mock(Command.class);
        commandBOn = mock(Command.class);
        commandBOff = mock(Command.class);
    }

    @Test
    public void testSettingFirstCommandShouldNotExecuteIt() {
        givenFirstCommandSetToA();

        verify(commandAOn, times(0)).execute();
        verify(commandAOff, times(0)).execute();
    }

    @Test
    public void testSettingSecondCommandsShouldNotExecuteIt() {
        givenSecondCommandSetToB();

        verify(commandBOn, times(0)).execute();
        verify(commandBOff, times(0)).execute();
    }

    @Test
    public void testPushingOnShouldOnlyExecuteTheOnCommand() {
        givenFirstCommandSetToA();

        whenPushFirstCommandOn();

        verify(commandAOn).execute();
        verify(commandAOff, times(0)).execute();
    }

    @Test
    public void testPushingOffShouldOnlyExecuteTheOffCommand() {
        givenFirstCommandSetToA();

        whenPushFirstCommandOff();

        verify(commandAOn, times(0)).execute();
        verify(commandAOff).execute();
    }

    @Test
    public void testPushingOnAndOffShouldExecuteOnAndOffCommands() {
        givenFirstCommandSetToA();

        whenPushFirstCommandOn();
        whenPushFirstCommandOff();

        verify(commandAOn).execute();
        verify(commandAOff).execute();
    }

    @Test
    public void testPressingOnButtonsWithoutCommandShouldNotThrow() {
        whenPushFirstCommandOn();
        whenPushSecondCommandOn();
    }

    @Test
    public void testPressingOffButtonsWithoutCommandShouldNotThrow() {
        whenPushFirstCommandOff();
        whenPushSecondCommandOff();
    }

    private void givenFirstCommandSetToA() {
        remoteControl.setCommand(0, commandAOn, commandAOff);
    }

    private void givenSecondCommandSetToB() {
        remoteControl.setCommand(1, commandBOn, commandBOff);
    }

    private void whenPushFirstCommandOn() {
        remoteControl.onButtonWasPushed(0);
    }

    private void whenPushFirstCommandOff() {
        remoteControl.offButtonWasPushed(0);
    }

    private void whenPushSecondCommandOn() {
        remoteControl.onButtonWasPushed(1);
    }

    private void whenPushSecondCommandOff() {
        remoteControl.offButtonWasPushed(1);
    }
}
