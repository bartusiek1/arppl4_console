package pl.sda.arp4.console;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        Scanner scanner = new Scanner (System.in);

        // wczytywanie od użytkownika jego imienia (jakiegokolwiek tekstu - 1 słowo/token)
        String zmiennaImie = scanner.next();

        // wypisanie imienia użytkownika (konkatenacja z komunikatem)
        System.out.println("Witaj " + zmiennaImie + "!");

    }
}
