package ABM;

import Database.TerminalDataBase;
import Zone.Terminal;

import java.util.HashMap;

public class TerminalABM {

    private TerminalDataBase terminalDataBase;

    public TerminalABM(TerminalDataBase terminalDataBase) {
        this.terminalDataBase = terminalDataBase;
    }

    public void addToABM(Terminal terminal) {
        terminalDataBase.add(terminal.getTerminalId(), terminal);
    }

    public void removeFromABM(Integer terminalId) {
        terminalDataBase.remove(terminalId);
    }

}
