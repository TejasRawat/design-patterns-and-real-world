package pattern.singleton;

import java.util.Objects;

public class SingletonClass {

    private volatile static SingletonClass singleClassInstance;

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        if (Objects.isNull(singleClassInstance)) {
            synchronized (SingletonClass.class) {
                if (Objects.isNull(singleClassInstance)) {
                    singleClassInstance = new SingletonClass();
                }
            }
        }
        return singleClassInstance;
    }
}
