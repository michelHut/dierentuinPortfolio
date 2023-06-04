package org.example;

import java.util.ArrayList;

public class DierBeheer {
    public static ArrayList<Dier> dieren = new ArrayList<>();

    public static void voegDierenToe(Dier dier) {
        dieren.add(dier);

    }
    public static void getDierenInBezit() {

        for (Dier dier : dieren) {
            System.out.println("");
            System.out.println("----------");
            System.out.println("soort dier: " + dier.getSoort());
            System.out.println("naam: " + dier.getNaam());
            System.out.println("----------");
            System.out.println("");
        }

    }

    public static void bezoekDier(String soort, String naam) {
        Dier diersoort = null;
        for (Dier dier : dieren) {
            if (soort.equalsIgnoreCase(dier.getSoort()) && naam.equalsIgnoreCase(dier.getNaam())) {
                diersoort = dier;
            }
            diersoort.weergeefMeerInfo();
        }
    }
}
