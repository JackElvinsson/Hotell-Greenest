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
        //växterlista.add(new Kaktus("Igge", 0.02));
        //växterlista.add(new Palm("Laura", 5));
        //växterlista.add(new Köttätande("Meatloaf", 0.7));
        //växterlista.add(new Palm("Putte", 1));


        while (true) {

            try {

                String växt = JOptionPane.showInputDialog(null, "Vilken växt ska få vätska").toLowerCase().trim();

                switch (växt) {

//            case "igge" -> System.out.println(igge.vätska());
//            case "laura" -> System.out.println(laura.vätska());
//            case "meatloaf" -> System.out.println(meatloaf.vätska()
//            case "putte" -> System.out.println(putte.vätska());
//            default -> System.out.println("Det finns ingen växt med det namnet.");

                    case "igge" -> JOptionPane.showMessageDialog(null, igge.vätska());
                    case "laura" -> JOptionPane.showMessageDialog(null, laura.vätska());
                    case "meatloaf" -> JOptionPane.showMessageDialog(null, meatloaf.vätska());
                    case "putte" -> JOptionPane.showMessageDialog(null, putte.vätska());
                    default -> JOptionPane.showMessageDialog(null, "Det finns ingen växt med det namnet");

                }

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