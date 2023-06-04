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

    public abstract void execute(HoofdMenu hoofdMenu);
}



class koopNieuwDierMenuItem extends MenuItem{

    public koopNieuwDierMenuItem(String name) {
        super(name);
    }

    @Override
    public void execute(HoofdMenu hoofdmenu) {
        DierFabriek dierFabriek;
        IO io = new IO();

        io.printLn("Wat voor dier wilt u kopen?");
        io.printLn("U heeft keuze uit: Olifant, Leeuw, Stokstaart");

        String dier = io.getInputString();
        System.out.println(dier);

        io.printLn("Wat voor naam krijgt het " + dier + "?");
        String naam = io.getInputString();
        System.out.println(naam);

        io.printLn("Is het een roofdier? (true of false)");
        boolean roofdier = io.getInputBool();
        System.out.println(roofdier);

        String geslacht = "man";
        String voeding = "vlees";

        if (roofdier) {
            dierFabriek = new RoofdierFabriek();
        } else {
            dierFabriek = new ProoiDierFabriek();
        }

        dierFabriek.creeerDier(dier, naam, geslacht, voeding);

        io.printLn("U heeft succesvol een " + dier + " gekocht!");

        hoofdmenu.executeMenu();
    }

}

class bezoekDierMenuItem extends MenuItem{

    public bezoekDierMenuItem(String name) {
        super(name);
    }

    @Override
    public void execute(HoofdMenu hoofdmenu) {
        IO io = new IO();
        io.printLn("Dit zijn je huidige dieren");
        DierBeheer.getDierenInBezit();
        io.printLn("welke wil je bezoeken?");
        io.printLn("voer het soort in");
        String dierSoort = io.getInputString();
        io.printLn("voer de naam in");
        String naam = io.getInputString();

        DierBeheer.bezoekDier(dierSoort, naam);
        hoofdmenu.executeMenu();
    }
}