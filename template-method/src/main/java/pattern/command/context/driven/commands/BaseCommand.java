package pattern.command.context.driven.commands;

import pattern.command.context.driven.context.CommandContext;
import pattern.command.context.driven.exception.CommandException;

public abstract class BaseCommand<CmdRequest, CmdResponse> implements Command<CommandContext, CommandContext> {

    @Override
    public CommandContext execute(CommandContext commandContext) throws CommandException {
        CmdRequest request = extractCmdRequest(commandContext);
        validateCmdRequest(request);
        CmdResponse cmdResponse = executeCmdRequest(request);
        attachCmdResponseToContext(cmdResponse);
        return commandContext;
    }

    protected abstract void attachCmdResponseToContext(CmdResponse cmdResponse);

    protected abstract CmdResponse executeCmdRequest(CmdRequest request);

    protected abstract void validateCmdRequest(CmdRequest request);

    protected abstract CmdRequest extractCmdRequest(CommandContext commandContext);

}
