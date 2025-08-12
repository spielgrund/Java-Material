import java.util.ArrayList;

public class x_Arraylist {
    public static void main(String[] args) {
        ArrayList<String> arrlistString = new ArrayList<>();
        arrlistString.add("Eins");
        arrlistString.add("Zwei");
        arrlistString.add("Drei");

        System.out.println(arrlistString);
        System.out.println(arrlistString.get(1));
        System.out.println(arrlistString.size());
    }
}
