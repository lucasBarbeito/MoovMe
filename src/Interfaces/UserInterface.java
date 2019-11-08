package Interfaces;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

public class UserInterface {




    ArrayList<String> userOptions;

    public UserInterface(ArrayList<String> userOptions) {
        this.userOptions = userOptions;
    }

    void printMenu() {
        for (int i = 0; i < userOptions.size(); i++) {
            System.out.println((i + 1) + ". " + userOptions.get(i));
        }
    }


}
