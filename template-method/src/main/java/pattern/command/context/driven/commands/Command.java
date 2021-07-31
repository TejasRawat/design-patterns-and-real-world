package pattern.command.context.driven.commands;

import pattern.command.context.driven.exception.CommandException;

public interface Command<Request,Response> {

    Response execute(Request request) throws CommandException;

}
