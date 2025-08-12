public class x_String {
    public static void main(String[] args) {
        String s = new String();
        s = "Hallo";
        s = s + ", Welt!";

        System.out.println(s);
        String s1 = "";
        for (int i = 0; i < 100000; i++) {
            s1 += i;
            s1 += "\n";
        }
        System.out.println(s1);
        System.out.println("\n\n");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 100000; i++) {
            sb.append(i);
        }
        System.out.println(sb);
    }
}
