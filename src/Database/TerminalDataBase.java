package Database;

import Zone.Terminal;

public class TerminalDataBase extends Database<Terminal> {

    public TerminalDataBase() { super(); }

    @Override
    public void printData() {
        for (Terminal terminal: hashmap.values()) {
            System.out.println(terminal.getItsZone() + " // " + terminal.getTerminalId());
        }
    }
}
