package org.example;

public class KiesDierFabriek {
    public DierFabriek keuze(String diersoort) {

        if (diersoort.equalsIgnoreCase("leeuw")) {
            return new LeeuwFabriek();
        } else if (diersoort.equalsIgnoreCase("olifant")) {
            return new OlifantFabriek();
        } else if (diersoort.equalsIgnoreCase("stokstaart")) {
            return new StokstaartFabriek();
        } else {
            throw new IllegalArgumentException("Ongeldig diersoort: " + diersoort);
        }
    }
}
