package ABM;

import java.util.ArrayList;

public abstract class ABM<T> {

    private ArrayList<T> list;

    public ABM(int initialCapacity) {
        list = new ArrayList<T>(initialCapacity);
    }

    public void add(T t) {
        // agrega un usuario o activo
    }

    public void remove(T t) {
        // elimina un usuario o activo
    }
}
