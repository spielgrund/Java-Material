
import java.util.Arrays;


public class Loops {

    public static void main(String[] args) {
        int i = 0;

        while (i == 0){
            System.out.println("While loop i = " + i);
            i++;

        }

        do {
            System.out.println("do loop i = " + i);
            i++;
        }while (i < 3);



        for (int j = 0; j < 3; j++){
            System.out.println("j ist " + j);
        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        System.out.println(cars);
        System.out.println(Arrays.toString(cars));


        //enhanced Loop
        for (String car : cars) {
            System.out.println(car);
        }

        //standart loop
        for (int j = 0; j < cars.length; j++) {
            System.out.println(cars[j]);
        }


    }
}
