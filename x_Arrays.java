import java.util.Arrays;

public class x_Arrays {
    public static void main(String[] args) {
        int[] intarr = new int[5];                          // Größe des Arrays muss immer angegeben werden
        intarr[1] = 1;                                      // Zuweisung auf index
        String[] stringarr = {"Eins", "Zwei", "Drei"};      // Kurzschreibweise mit direkter Zuweisung
        int[][] matrix = {{1, 2}, {3, 4}};                  // Mehrdimensionale Arrays

        System.out.println(intarr);                         // Gibt nur die Objektform aus
        System.out.println(intarr[0]);                      // Wird Standartmäßig mit 0 initialisiert
        System.out.println(intarr[1]);
        System.out.println(Arrays.toString(stringarr));     // Arrays bietet viele Hilfsklassen
        System.out.println(intarr.length);                  // Länge des Arrays
        System.out.println(Arrays.deepToString(matrix));    // Hilfsfunktion für Mehrdimensionale Arrays
    }
}
