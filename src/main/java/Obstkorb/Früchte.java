package Obstkorb;


import java.util.ArrayList;
import java.util.List;

public class Früchte {



    public static void main(String[] args) {
        Obst erstefrucht = new Obst("Der rote Baron", 6, "rot", 300, "Apfel");
        Obst zweitefrucht = new Obst("Weiche Kartoffel", 8, "gelb", 500, "Birne");
        Obst drittefrucht = new Obst("Der tolle Apfel", 7, "rot", 700, "Apfel");
        Obst viertefrucht = new Obst("Die Torte", 2, "orange", 1000, "Orange");
        ObstInterface fünftefrucht = new Apfel("Zurus", 50, "pink", 499);
        ObstInterface sechstefrucht = new Banane("Esel", 89, "gelb", 989);
        ObstInterface siebtefrucht = new Banane("Internationale Bambusfrucht", 534, "gelb" , 1000);

        List<ObstInterface> obst = new ArrayList<ObstInterface>();
        obst.add(erstefrucht);
        obst.add(zweitefrucht);
        obst.add(drittefrucht);
        obst.add(viertefrucht);
        obst.add(fünftefrucht);
        obst.add(sechstefrucht);
        obst.add(siebtefrucht);

        String n = "Cinderella";
        int o = obst.size();

        System.out.println("Hallo. Ich bin der magische Obstkorb namens " + n + " ich habe grade " + o + " Früchte in mir");

        /**
         * Diese Schleife sollte den inhalt des "Obstkorbs" ausgeben
         */
        for (int i = 0; i < obst.size(); i++) {
            obst.get(i).Früchtedaten();
            System.out.println(i);



        }


    }
}
