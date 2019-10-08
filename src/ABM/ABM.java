package ABM;

import java.util.ArrayList;

public abstract class ABM<T> {

    protected ArrayList<T> list;

    public ABM(int initialCapacity) {
        list = new ArrayList<T>(initialCapacity);
    }

    public void add(T t) {
        list.add(t);
    }

    public void remove(T t) {
        list.remove(t);
    }

}
