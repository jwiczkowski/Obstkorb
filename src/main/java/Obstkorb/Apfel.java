package Obstkorb;

/**
 * Created by jwiczkowski on 04.08.16.
 */
public class Apfel implements ObstInterface {



    String Namen;
    int Größe;
    String Farbe;
    int Gewicht;
    String Art = "Apfel";

    Apfel(String derName, int dieGröße, String dieFarbe, int dasGewicht) {
        Namen = derName;
        Größe = dieGröße;
        Farbe = dieFarbe;
        Gewicht = dasGewicht;

    }
        public void Früchtedaten(){


            System.out.println(Namen);
            System.out.println("Länge : " + Größe + " cm");
            System.out.println("Farbe : "+ Farbe);
            System.out.println("Gewicht : " + Gewicht + " g ");
            System.out.println("Früchte Typ : " + Art);


        }







}
