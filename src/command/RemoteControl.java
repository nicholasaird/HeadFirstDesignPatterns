package command;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private static final int NUM_SLOTS = 2;

    public RemoteControl() {
        onCommands = new Command[NUM_SLOTS];
        offCommands = new Command[NUM_SLOTS];

        for (int i = 0; i < NUM_SLOTS; i++) {
            onCommands[i] = new NothingCommand();
            offCommands[i] = new NothingCommand();
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }
}
