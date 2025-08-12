import java.util.Arrays;

public class x_String2 {
    public static void main(String[] args) {
        String s = "Hallo, Welt!";
        System.out.println(s);
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.equals("Hallo, Welt!"));
        System.out.println(s.charAt(0));
        System.out.println(Arrays.toString(s.split(" ")));
        System.out.println(s.split(" ").length);
        System.out.println(Arrays.toString(s.toCharArray()));
        System.out.println(s.indexOf("l"));
        System.out.println(s.substring(3));
    }
}
