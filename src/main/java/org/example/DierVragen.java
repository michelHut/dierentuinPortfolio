package org.example;

public class DierVragen {
    public String vraagDierNaam(String dier) {
        IO.printLn("Wat voor naam krijgt het " + dier + "?");
        return IO.getInputString();
    }

    public String vraagDierType() {
        IO.printLn("Wat voor dier wilt u kopen?");
        IO.printLn("U heeft keuze uit: Olifant, Leeuw, Stokstaart");
        return IO.getInputString();
    }
}
