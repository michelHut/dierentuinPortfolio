package org.example;

import java.util.Scanner;

public abstract class MenuItem {
    private final String name;
    public MenuItem(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public abstract void execute(Menu hoofdMenu);
}



class koopNieuwDierMenuItem extends MenuItem {

    public koopNieuwDierMenuItem(String name) {
        super(name);
    }

    @Override
    public void execute(Menu menu) {
        new MenuItemKoopDierBeheer().koopDier(menu);
    }
}
class bezoekDierMenuItem extends MenuItem {

    public bezoekDierMenuItem(String name) {
            super(name);
        }
        @Override
        public void execute(Menu menu) {
            new bezoekDierMenuItemBeheer().bezoekDierBeheer(menu);
        }
}
