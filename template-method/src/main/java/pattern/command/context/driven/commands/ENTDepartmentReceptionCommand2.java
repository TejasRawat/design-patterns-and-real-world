package pattern.command.context.driven.commands;

import pattern.command.context.driven.context.CommandContext;
import pattern.command.context.driven.model.Input2;
import pattern.command.context.driven.model.Output2;

public class ENTDepartmentReceptionCommand2 extends BaseCommand<Input2, Output2> {

    @Override
    protected Input2 extractCmdRequest(CommandContext commandContext) {
        return null;
    }

    @Override
    protected void validateCmdRequest(Input2 input2) {

    }

    @Override
    protected Output2 executeCmdRequest(Input2 input2) {
        return null;
    }

    @Override
    protected void attachCmdResponseToContext(Output2 output2) {

    }


}
