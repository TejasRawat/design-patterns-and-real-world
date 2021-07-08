package command.context.driven;

public abstract class BaseCommand<CmdRequest, CmdResponse> implements Command<CommandContext> {

    @Override
    public void execute(CommandContext commandContext) throws CommandException {
        CmdRequest request = extractCmdRequest(commandContext);
        validateCmdRequest(request);
        CmdResponse cmdResponse = executeCmdRequest(request);
        attachCmdResponseToContext(cmdResponse);
    }

    protected abstract void attachCmdResponseToContext(CmdResponse cmdResponse);

    protected abstract CmdResponse executeCmdRequest(CmdRequest request);

    protected abstract void validateCmdRequest(CmdRequest request);

    protected abstract CmdRequest extractCmdRequest(CommandContext commandContext);

}
