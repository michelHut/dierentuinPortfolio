package org.example;

public class MenuItemKoopDierBeheer {
    public void koopDier(Menu menu) {
        DierVragen dierVragen = new DierVragen();
        String dier = dierVragen.vraagDierType();
        String naam = dierVragen.vraagDierNaam(dier);
        DierFabriek dierFabriek =  new KiesDierFabriek().keuze(dierVragen.vraagDierType());
        DierBeheer.voegDierenToe(dierFabriek.creeerDier(naam, "man", "vlees"));
        IO.printLn("U heeft succesvol een " + dier + " gekocht!");
        menu.executeMenu();
    }

}
class bezoekDierMenuItemBeheer{

    public void bezoekDierBeheer(Menu menu){
        IO.printLn("Dit zijn je huidige dieren");
        DierBeheer.getDierenInBezit();
        IO.printLn("welke wil je bezoeken?");
        IO.printLn("voer het soort in");
        String dierSoort = IO.getInputString();
        IO.printLn("voer de naam in");
        String naam = IO.getInputString();

        DierBeheer.bezoekDier(dierSoort, naam);
        menu.executeMenu();    }

}

