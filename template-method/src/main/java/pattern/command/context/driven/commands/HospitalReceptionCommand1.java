package pattern.command.context.driven.commands;

import pattern.command.context.driven.context.CommandContext;
import pattern.command.context.driven.model.Input1;
import pattern.command.context.driven.model.Output1;

public class HospitalReceptionCommand1 extends BaseCommand<Input1, Output1> {

    @Override
    protected Input1 extractCmdRequest(CommandContext commandContext) {
        return null;
    }

    @Override
    protected void validateCmdRequest(Input1 input1) {

    }

    @Override
    protected Output1 executeCmdRequest(Input1 input1) {
        return null;
    }

    @Override
    protected void attachCmdResponseToContext(Output1 output1) {

    }


}
