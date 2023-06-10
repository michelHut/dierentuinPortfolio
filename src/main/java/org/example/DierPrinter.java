package org.example;

public class DierPrinter {
        public void printInfo(Dier dier) {
            IO.printLn("naam: " + dier.getNaam());
            IO.printLn("geslacht: " + dier.getGeslacht());
            IO.printLn("voeding: " + dier.getVoeding());
            dier.weergeefMeerInfo();
        }

        public void printExtraInfo(Dier dier) {
            IO.printLn("soort dier: " + dier.getSoort());
            IO.printLn("hij maakt het geluid: " + dier.getGeluid());
        }

}
