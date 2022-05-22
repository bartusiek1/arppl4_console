package pl.sda.arp4.console;

import java.util.Scanner;

public class MainEnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // opcja z liczbą
        /*
        System.out.println("Podaj swój stan cywilny: ");
        String stanCywilny = scanner.next();


        System.out.println("Podaj swój stan cywilny: (0-wolny, 1-zajęty)");
        int stanCywilny = scanner.nextInt();

        if (stanCywilny == 1) {
            StanCywilny zmiennaStanCywilny = StanCywilmny.ZAJETY;       // StanCywilny to nazwa naszego ENUMA
        } else {                                                        // Gdyby zmienną była treść byłby to string
            StanCywilny zmiennaStanCywilny = StanCywilny.WOLNY;         // a jeśli liczna int.
        }                                                               // A jako że stworzyliśmy ENUMA stał się on nowym typem zmiennej
                                                                        //
        */

        // OPCJA II - warunek IF"


        System.out.println("Podaj swój stan cywilny: (wolny/zajęty)");
        String stanCywilny = scanner.next();

        // Deklaracja przed if'em

        //StanCywilny zmiennaStanCywilny;           //- ten waroant stosujemy gdy chcemy skorzystać z samych IF
        StanCywilny zmiennaStanCywilny = StanCywilny.NIEZNANY;   // przypisujemy naszą otrzymaną zmienną do naszego ENUMA

        // Przypisujemy wartość na podstawie wpisanego tekstu

        if (stanCywilny.equalsIgnoreCase("ZAJETY")) {
            zmiennaStanCywilny = StanCywilny.ZAJETY;
        } else if (stanCywilny.equalsIgnoreCase("wolny")) {
            zmiennaStanCywilny = StanCywilny.WOLNY;
        } else {
            zmiennaStanCywilny = StanCywilny.NIEZNANY;
        }
        // mogę skorzystać ze zmiennej którą zadeklarowałem przed if
        System.out.println(zmiennaStanCywilny);


        // OPCJA III - dorzucamy jeszczwe switcha


        switch (zmiennaStanCywilny) {
            case WOLNY:                 // if (zmiennaStanCywilny == WOLNY)
                System.out.println("To jest wolny ziomek");
                break;
            case ZAJETY:                // // if (zmiennaStanCywilny == ZAJETY)
                System.out.println("Ten typ jest zajęty");
                break;
            default:
                System.out.println("Ani wolny, ani zajęty. Nie wiemy!");
        }
    }
}

