package pattern.command.context.driven.context;

import java.util.concurrent.ConcurrentHashMap;

public class CommandContext extends ConcurrentHashMap<String, Object> {

    public <T> T getContextField(String key) {
        return (T) get(key);
    }

    public void addContextField(String key, Object field) {
        put(key, field);
    }

}
