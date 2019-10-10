package ABM;

import Database.TerminalDataBase;
import Zone.Terminal;

import java.util.HashMap;

public class TerminalABM {

    private HashMap<Integer, Terminal> terminals;
    private TerminalDataBase terminalDataBase;

    public TerminalABM(HashMap<Integer, Terminal> terminals) {
        this.terminals = terminals;
    }

    public void addToABM(){
        Terminal terminal = TerminalDataBase.find(Terminal.getTerminalId());
        TerminalDataBase.add(terminal.getTerminalId(), terminal);
    }

    public void removeFromABM(){
        Terminal terminal = TerminalDataBase.find(Terminal.getTerminalId());

    }
}
