package org.example;

import java.util.ArrayList;

public class DierBeheer {
    public static ArrayList<Dier> dieren = new ArrayList<>();

    public static void voegDierenToe(Dier dier) {
        dieren.add(dier);

    }
    public static void getDierenInBezit() {

        for (Dier dier : dieren) {
            IO.printLn("");
            IO.printLn("----------");
            IO.printLn("soort dier: " + dier.getSoort());
            IO.printLn("naam: " + dier.getNaam());
            IO.printLn("----------");
            IO.printLn("");
        }

    }
    public static void bezoekDier(String soort, String naam) {
        Dier diersoort = null;
        for (Dier dier : dieren) {
            if (soort.equalsIgnoreCase(dier.getSoort()) && naam.equalsIgnoreCase(dier.getNaam())) {
                diersoort = dier;
            }
            new DierPrinter().printInfo(diersoort);
        }
    }
}
