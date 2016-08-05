package Obstkorb;

public class Obst implements ObstInterface  {
    String Apfel;
    int Größe;
    String Farbe;
    int Gewicht;
    String Art;

    Obst(String derApfel, int dieGröße, String dieFarbe, int dasGewicht, String DieArt){
        Apfel = derApfel;
        Größe = dieGröße;
        Farbe = dieFarbe;
        Gewicht = dasGewicht;
        Art = DieArt;
    }

    public void Früchtedaten(){


        System.out.println(Apfel);
        System.out.println("Länge : " + Größe + " cm");
        System.out.println("Farbe : "+ Farbe);
        System.out.println("Gewicht : " + Gewicht + " g ");
        System.out.println("Früchte Typ : " + Art);


    }



}










