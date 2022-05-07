package pl.sda.arp4.console;

import java.util.Scanner;

public class MainEnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Podaj swój stan cywilny: ");
        String stanCywilny = scanner.next();

        // Deklaracja przed if'em
        StanCywilny zmiennaStanCywilny = StanCywilny.NIEZNANY;

        // Przypisujemy wartość na podstawie wpisanego tekstu
        String anotherString;
        if (stanCywilny.equalsIgnoreCase("ZAJETY")) {
            zmiennaStanCywilny = StanCywilny.ZAJETY;
        } else if (stanCywilny.equalsIgnoreCase("wolny")) {
            zmiennaStanCywilny = StanCywilny.WOLNY;
        }
        // mogę skorzystać ze zmiennej którą zadeklarowałem przed if
        System.out.println(zmiennaStanCywilny);

// druga możliwość rozwiązania tego problemu
        switch (zmiennaStanCywilny) {
            case WOLNY:
                System.out.println("To jest wolny ziomek");
                break;
            case ZAJETY:
                System.out.println("Ten typ jest zajęty");
                break;
            default:
                System.out.println("Ani wolny, ani zajęty. Nie wiemy!");
        }


    }
}
