package org.example;

public abstract class Dier {

    private String naam;
    private String geslacht;
    private String voeding;
    private String geluid;
    private String soort;
    public String getNaam() {
        return naam;
    }
    public String getGeslacht() {
        return geslacht;
    }
    public String getVoeding() {
        return voeding;
    }
    public String getSoort(){
        return soort;
    }
    protected String getGeluid() {
        return geluid;
    }

    public Dier(String naam, String geslacht, String voeding, String geluid, String soort){
        this.naam = naam;
        this.geslacht = geslacht;
        this.voeding = voeding;
        this.geluid = geluid;
        this.soort = soort;
    }
    public abstract void weergeefMeerInfo();
}
class Leeuw extends Dier{
    public Leeuw(String naam, String geslacht, String voeding) {
        super(naam, geslacht, voeding,"Rawr","Leeuw");
    }

    @Override
    public void weergeefMeerInfo() {
        new DierPrinter().printExtraInfo(this);
    }
}

class Olifant extends Dier{
    public Olifant(String naam, String geslacht, String voeding) {
        super(naam, geslacht, voeding,"PFoeeeee", "Olifant");
    }

    @Override
    public void weergeefMeerInfo() {
        new DierPrinter().printExtraInfo(this);
    }
}

class Stokstaart extends Dier {
    public Stokstaart(String naam, String geslacht, String voeding) {
        super(naam, geslacht, voeding,"Miep Miep", "Stokstaart");
    }

    @Override
    public void weergeefMeerInfo() {
        new DierPrinter().printExtraInfo(this);
    }
}
