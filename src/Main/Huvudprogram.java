package Main;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Huvudprogram {

    List<Växt> växterlista = new ArrayList<>();

    Huvudprogram() {

        Kaktus igge = new Kaktus("Igge", 0.02);
        Palm laura = new Palm("Laura", 5);
        Köttätande meatloaf = new Köttätande("Meatloaf", 0.7);
        Palm putte = new Palm("Putte", 1);

        växterlista.add(igge);
        växterlista.add(laura);
        växterlista.add(meatloaf);
        växterlista.add(putte);


        while (true) {

            try {

                String växt = JOptionPane.showInputDialog(null, "~Hotel Greenest~\nVilken växt ska få vätska?").toLowerCase().trim();

                boolean växtHittad = false;

                for (Växt v : växterlista) {
                    if (v.getNamn().toLowerCase().equals(växt)) {
                        JOptionPane.showMessageDialog(null, v.bevattningPrintable());
                        växtHittad = true;
                        break;
                    }
                }

                if (!växtHittad) {
                    JOptionPane.showMessageDialog(null, "Det finns ingen incheckad växt med det namnet,\nförsök igen!");
                }

                //  "Cancel"
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Program avslutat");
                System.exit(0);
            }
        }
    }


    public static void main(String[] args) {

        Huvudprogram huvudProgram = new Huvudprogram();

    }
}