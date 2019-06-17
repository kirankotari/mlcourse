package command.receiver;

import command.*;

public class MultCommand extends Command {
    private ArrayOperation ao;
    public MultCommand(ArrayOperation ao) {
        this.ao = ao;
    }
    public void execute() {
        this.ao.product();
    }
}
