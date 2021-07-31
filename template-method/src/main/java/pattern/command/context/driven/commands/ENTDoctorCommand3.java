package pattern.command.context.driven.commands;

import pattern.command.context.driven.context.CommandContext;
import pattern.command.context.driven.model.Input3;
import pattern.command.context.driven.model.Output3;

public class ENTDoctorCommand3 extends BaseCommand<Input3, Output3> {

    @Override
    protected Input3 extractCmdRequest(CommandContext commandContext) {
        return null;
    }

    @Override
    protected void validateCmdRequest(Input3 input3) {

    }

    @Override
    protected Output3 executeCmdRequest(Input3 input3) {
        return null;
    }

    @Override
    protected void attachCmdResponseToContext(Output3 output3) {

    }


}
