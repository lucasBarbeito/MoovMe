package Database;

import Zone.Terminal;
import java.util.HashMap;

public class TerminalDataBase extends Database {

    private HashMap<Integer, Terminal> terminals;

    public TerminalDataBase() {
        terminals = new HashMap<>();
    }

    public void addTerminal(Integer terminald, Terminal aTerminal) {
        add(terminald, aTerminal, terminals);
    }

    public void removeTerminal(Integer terminald) {
        remove(terminald, terminals);
    }

    public Terminal findTerminal(Integer terminalId) {
        return find(terminalId, terminals);
    }

}
