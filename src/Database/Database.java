package Database;

import Members.*;
import Zone.Terminal;
import java.util.HashMap;

public abstract class Database {

    <Key, Value> Value find(Key key, HashMap<Key, Value> hashmap) {
        return hashmap.get(key);
    }

    <Key, Value> void remove(Key key, HashMap<Key, Value> hashmap) {
        hashmap.remove(key);
    }

    <Key, Value> void add(Key key, Value aValue, HashMap<Key, Value> hashmap) {
        hashmap.put(key, aValue);
    }

    //public void printData();

}