package command.context.driven.commands;

import command.context.driven.exception.CommandException;

public interface Command<Request> {

    void execute(Request request) throws CommandException;

}
