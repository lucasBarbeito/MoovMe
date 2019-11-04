package Database;

import java.util.HashMap;

public abstract class Database {

    <Key, Value> Value find(Key key, HashMap<Key, Value> hashMap) {
        return hashMap.get(key);
    }

    <Key, Value> void remove(Key key, HashMap<Key, Value> hashMap) {
        hashMap.remove(key);
    }

    <Key, Value> void add(Key key, Value aValue, HashMap<Key, Value> hashMap) {
        hashMap.put(key, aValue);
    }

    <Key, Value> boolean checkKey(Key key, HashMap<Key, Value> hashMap) {
        return hashMap.containsKey(key);
    }

}