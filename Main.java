import java.util.Scanner;

public class Main {





    public static void main(String[] args) {
        Person p1 = new Person(1,"Peter");
        Buch b1 = new Buch("1234", "Moby Dick", "Roman");

        System.out.println(p1.alter);
        System.out.println(p1.name.toLowerCase());
        p1.sageName();
        p1.sageWort("Hallo!");
        System.out.println(b1);


    }
}
