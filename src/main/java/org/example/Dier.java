package org.example;

public abstract class Dier {

    private String naam;
    private String geslacht;
    private String voeding;
    public String getNaam() {
        return naam;
    }

    public String getGeslacht() {
        return geslacht;
    }

    public String getVoeding() {
        return voeding;
    }

    public Dier(String naam, String geslacht, String voeding){
        this.naam = naam;
        this.geslacht = geslacht;
        this.voeding = voeding;
    }

    public abstract void weergeefMeerInfo();
    public void weergeefInfo(){
        System.out.println("naam: " + naam);
        System.out.println("geslacht: " + geslacht);
        System.out.println("voeding: " + voeding);
        weergeefMeerInfo();

    }
    public abstract String getSoort();
}

class Leeuw extends Dier{
    private final String geluid = "Rawr";
    private final String soort = "Leeuw";
    public Leeuw(String naam, String geslacht, String voeding) {
        super(naam, geslacht, voeding);
    }

    @Override
    public void weergeefMeerInfo() {
        System.out.println("soort dier: " + soort);
        System.out.println("hij maakt het geluid: " + geluid);
    }

    @Override
    public String getSoort() {
        return soort;
    }

}

class Olifant extends Dier{
    private final String geluid = "pfffoeee";
    private final String soort = "Olifant";
    public Olifant(String naam, String geslacht, String voeding) {
        super(naam, geslacht, voeding);
    }

    @Override
    public void weergeefMeerInfo() {
        System.out.println("soort dier: " + soort);
        System.out.println("hij maakt het geluid: " + geluid);
    }
    @Override
    public String getSoort() {
        return soort;
    }
}

class Stokstaart extends Dier{
    private final String geluid = "miep miep";
    private final String soort = "Stokstaart";
    public Stokstaart(String naam, String geslacht, String voeding) {
        super(naam, geslacht, voeding);
    }

    @Override
    public void weergeefMeerInfo() {
        System.out.println("soort dier: " + soort);
        System.out.println("hij maakt het geluid: " + geluid);
    }
    @Override
    public String getSoort() {
        return soort;
    }
}
