package command.context.driven;

public interface Command<Request> {

    void execute(Request request) throws CommandException;

}
