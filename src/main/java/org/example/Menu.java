package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    protected ArrayList<MenuItem> menu = new ArrayList<>();
    protected int printMenu() {
        int index = 1;
        IO.printLn("Kies uw optie:");
        for (MenuItem item : menu) {
            IO.printLn(index + ": " + item.getName());
            index++;
        }
        return IO.getInputInt();
    }

    public void executeMenu(){
        menu.get(printMenu() - 1).execute(this);
    }
}

class HoofdMenu extends Menu {
    private boolean isMenuCreated = false;

    public void createMenu() {
        menu.add(new bezoekDierMenuItem("Bezoek dieren"));
        menu.add(new koopNieuwDierMenuItem("Koop nieuwe dieren"));
    }

    public void executeMenu() {
        if (!isMenuCreated) {
            createMenu();
            isMenuCreated = true;
        }
        super.executeMenu();
    }
}
