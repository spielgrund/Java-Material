public class Operatoren {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        int i = 0;

        System.out.println(a | b);
        System.out.println(a & b);
        System.out.println(a && i == 0);
        System.out.println("-------------------------------");
        System.out.println(a && i++ == 1);
        System.out.println(i);
        System.out.println(a && ++i == 2);
        System.out.println(i);

    }
}
