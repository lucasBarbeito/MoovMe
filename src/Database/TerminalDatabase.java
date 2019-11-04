package Database;

import Assets.Terminal;
import java.util.HashMap;

public class TerminalDatabase extends Database {

    private HashMap<Integer, Terminal> terminals;

    public TerminalDatabase() {
        terminals = new HashMap<>();
    }

    public void addTerminal(Terminal aTerminal) {
        add(aTerminal.getTerminalId(), aTerminal, terminals);
    }

    public void removeTerminal(Integer terminalId) {
        remove(terminalId, terminals);
    }

    public Terminal findTerminal(Integer terminalId) {
        return find(terminalId, terminals);
    }

}
