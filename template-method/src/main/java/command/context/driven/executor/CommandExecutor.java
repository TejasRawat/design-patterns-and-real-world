package command.context.driven.executor;

import command.context.driven.commands.Command;
import command.context.driven.context.CommandContext;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class CommandExecutor {

    private List<Command> commands = new LinkedList<>();
    private CommandContext commandContext;


    public CommandExecutor(CommandContext commandContext) {
        this.commandContext = commandContext;
    }

    public CommandExecutor addCommand(Command command) {
        commands.add(command);
        return this;
    }

    public CommandContext execute() {
        if (Objects.nonNull(commands) && !commands.isEmpty()) {
            for (Command command : commands) {
                executeCommand(command);
            }
        }
        return commandContext;
    }

    private void executeCommand(Command command) {
        command.execute(commandContext);
    }

}
