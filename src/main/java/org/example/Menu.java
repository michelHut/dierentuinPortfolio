package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Menu {
    protected ArrayList<MenuItem> menu = new ArrayList<>();
    protected int printMenu() {
        IO io = new IO();
        int index = 1;
        io.printLn("Kies uw optie:");
        for (MenuItem item : menu) {
            io.printLn(index + ": " + item.getName());
            index++;
        }
        return io.getInputInt();
    }

    public void executeMenu(ArrayList<MenuItem> menu,HoofdMenu hoofdMenu){
        int input = printMenu();
        menu.get(input - 1).execute(hoofdMenu);
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
        super.executeMenu(menu, this);
    }
}
