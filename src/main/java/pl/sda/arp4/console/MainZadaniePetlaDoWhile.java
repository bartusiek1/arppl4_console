package pl.sda.arp4.console;

import java.util.Scanner;

// Napisz program któy wypisuje "Hello world" dopóki użyutkownik podaje liczby większe od 0.

public class MainZadaniePetlaDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // deklaracja zmiennej przed pętlą, ponieważ
        int liczba;

        do {
            System.out.println("Podaj liczbę");
            liczba = scanner.nextInt();

           if (liczba > 0) {
               System.out.println("Hello World");
           }

            } while (liczba > 0);
        }
    }