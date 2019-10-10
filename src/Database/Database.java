package Database;

import java.util.HashMap;

public abstract class Database<Key, Value> {

    protected HashMap<Key, Value> hashmap;
    public Database() {
        this.hashmap = new HashMap<Key, Value>();
    }

    public Value find(Key key) {
        return hashmap.get(key);
    }

    public void remove(Key key) {
        hashmap.remove(key);
    }

    public void add(Key key, Value aValue) {
        hashmap.put(key, aValue);
    }

    public abstract void printData();

}