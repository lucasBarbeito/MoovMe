package ABM;

import Database.TerminalDataBase;
import Zone.Terminal;

public class TerminalABM {

    private TerminalDataBase terminalDataBase;

    public TerminalABM(TerminalDataBase terminalDataBase) {
        this.terminalDataBase = terminalDataBase;
    }

    public void addToABM(Terminal terminal) {
        terminalDataBase.addTerminal(terminal.getTerminalId(), terminal);
    }

    public void removeFromABM(Integer terminalId) {
        terminalDataBase.removeTerminal(terminalId);
    }

}
