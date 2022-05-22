package pl.sda.arp4.console;

import java.util.Scanner;

/*
Stwórz nowego maina i:
- zapytaj użytkownika o ilość powtórzeń
- wczytaj wartość ze scannera
- stwórz pętlę i N (ilość powtózeń) razy wyposz na ekranie "Hello Worlda"
- dopisz przed każdym powtózeniem numer ieracji

 */


public class MainIloscPowtorzen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ilość powtorzen");
        int liczba = scanner.nextInt();

        for (int i = 0; i < liczba; i++) {
            System.out.println((i+1) + " Hello World");
        }
    }
}