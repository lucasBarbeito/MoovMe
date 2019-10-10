package Database;

import java.util.HashMap;

public abstract class Database<Type> {

    protected HashMap<String, Type> hashmap;
    public Database() {
        this.hashmap = new HashMap<String, Type>();
    }

    public Type find(String username) {
        return hashmap.get(username);
    }

    public void remove(String username) {
        hashmap.remove(username);
    }

    public void add(String username, Type aType) {
        hashmap.put(username, aType);
    }

    public abstract void printData();

}