package command.receiver;

import command.Command;

public class AddCommand extends Command {
    private ArrayOperation ao;
    public AddCommand(ArrayOperation ao) {
        this.ao = ao;
    }
    public void execute() {
        this.ao.sum();
    }
}
