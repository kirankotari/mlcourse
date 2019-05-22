package command;
import command.*;
import command.invoker.*;
import command.receiver.*;

public class Main {
    public static void main(String[] args) {
        int mass[] = {-1, 71, 45, -20, 48, 60, 19};
        ArrayOperation receiver = new ArrayOperation(mass);
        Command operation1 = new MultCommand(receiver);
        Command operation2 = new AddCommand(receiver);
        ManagerCommands manager = new ManagerCommands(operation1);
        manager.exec();
        manager.setManager(operation2);
        manager.exec();
    }
}
