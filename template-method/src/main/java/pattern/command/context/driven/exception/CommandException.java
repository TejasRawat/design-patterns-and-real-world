package pattern.command.context.driven.exception;

public class CommandException extends RuntimeException {

    private String commandName;

    public CommandException(String commandName) {
        this.commandName = commandName;
    }

    public CommandException(String message, String commandName) {
        super(message);
        this.commandName = commandName;
    }

    public CommandException(String message, Throwable cause, String commandName) {
        super(message, cause);
        this.commandName = commandName;
    }

    public CommandException(Throwable cause, String commandName) {
        super(cause);
        this.commandName = commandName;
    }

    public CommandException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String commandName) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.commandName = commandName;
    }
}
