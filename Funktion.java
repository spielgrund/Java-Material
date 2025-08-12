public class Funktion {

    public static final float PI = 3.14159f;

    public static void print(String p) {
        System.out.println(p);
    }

    public static void print(int i) {               // Überladung durch einen anderen Parametertyp
        System.out.println(i);
    }

    public static void durchmesser(int r) {
        System.out.println(r * 2);
    }

    public static String umfang(int r) {
        return "" + (2 * PI * r);
    }

    public static double flaeche(int r){
        return PI * Math.pow(r, 2);
}


    public static void main(String[] args) {

        int r = 5;
        float pi = 3.14159f;

        print("Durchmesser: " + (r * 2));
        print("Umfang: " + (2 * pi * r));
        print("Fläche: " + (pi * r * r));

        durchmesser(r);                         // printet das Ergebnis selber
        print(umfang(r));                       // kann über unsere print Funktion laufen, da umfang einen String zurück gibt.
        System.out.println(flaeche(r));         // muss über sout ausgegeben werden, da flaeche() ein double zurück gibt


    }

}
