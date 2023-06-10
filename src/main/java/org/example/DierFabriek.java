package org.example;


public interface DierFabriek{
    Dier creeerDier(String naam, String geslacht, String voeding);

}
class LeeuwFabriek implements DierFabriek{
    @Override
    public Dier creeerDier(String naam, String geslacht, String voeding) {
        return new Leeuw(naam,geslacht,voeding);
    }
}
class OlifantFabriek implements DierFabriek{
    @Override
    public Dier creeerDier( String naam, String geslacht, String voeding) {
        return new Olifant(naam,geslacht,voeding);
    }
}
class StokstaartFabriek implements DierFabriek{
    @Override
    public Dier creeerDier(String naam, String geslacht, String voeding) {
        return new Stokstaart(naam,geslacht,voeding);
    }
}



