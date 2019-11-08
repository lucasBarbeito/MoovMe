package Interfaces;

import java.util.ArrayList;

public class AdministratorInterface extends UserInterface {

    ArrayList<String> adminOptions;

    public AdministratorInterface(ArrayList<String> userOptions, ArrayList<String> adminOptions) {
        super(userOptions);
        this.adminOptions = adminOptions;
    }

    @Override
    void printMenu() {
        super.printMenu();
        for (int i = 0; i < adminOptions.size(); i++) {
            System.out.println(userOptions.size() + i + 1
                                + ". " + userOptions.get(i));
        }
    }
}
