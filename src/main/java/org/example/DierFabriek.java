package org.example;


public interface DierFabriek{
    void creeerDier(String diersoort, String naam, String geslacht, String voeding);

}
class RoofdierFabriek implements DierFabriek {

    @Override
    public void creeerDier(String diersoort, String naam, String geslacht, String voeding) {
        Dier dier;
        if (diersoort.equalsIgnoreCase("leeuw")) {
            dier = new Leeuw(naam, geslacht, voeding);
        } else {
            throw new IllegalArgumentException("Dit dier bestaat niet als roofdier: " + diersoort);
        }

        DierBeheer.voegDierenToe(dier);
    }
}

class ProoiDierFabriek implements DierFabriek {

    @Override
    public void creeerDier(String diersoort, String naam, String geslacht, String voeding) {
        Dier dier;
        if (diersoort.equalsIgnoreCase("olifant")) {
            dier = new Olifant(naam, geslacht, voeding);
        } else if (diersoort.equalsIgnoreCase("stokstaart")) {
            dier = new Stokstaart(naam, geslacht, voeding);
        } else {
            throw new IllegalArgumentException("Dit dier bestaat niet: " + diersoort);
        }

        DierBeheer.voegDierenToe(dier);
    }


}



