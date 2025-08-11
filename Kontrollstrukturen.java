public class Kontrollstrukturen {

    public static void main(String[] args) {


        if (true) {
            System.out.println("Hallo");
        } else if (true) {
            System.out.println("Hallo2");
        } else {
            System.out.println("Hallo3");
        }


        int a = 3;

        switch (a) {
            case 0:
                System.out.println(0);
            case 1:
                System.out.println(1);
                break;
            default:
                System.out.println("default");
        }
    }
}
