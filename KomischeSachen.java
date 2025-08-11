

public class KomischeSachen {

    public static void print(String p){
        System.out.println(p);
    }

    public static void main(String[] args) {
        Byte b = 127;
        System.out.println(b);
        b++;
        System.out.println(b);

        Integer i1 = new Integer(120);
        Integer i2 = new Integer(120);
        System.out.println(i1.equals(i2));

        System.out.println("--------------------");

        Integer i3 = -127;
        Integer i4 = -127;

        System.out.println(i3 == i4);

        Integer i5 = -129;
        Integer i6 = -129;

        System.out.println(i5 == i6);

        int i7 = 200;
        int i8 = 200;

        System.out.println(i7 == i8);
        System.out.println("------------------------------------------");


        print("Hallo");
        print("test");
        Print.print("Printer");
    }
}
