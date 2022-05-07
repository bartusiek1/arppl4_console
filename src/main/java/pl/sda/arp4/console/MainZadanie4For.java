package pl.sda.arp4.console;

import java.util.Scanner;

public class MainZadanie4For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Zadanie:
        //    Napisać program w którym użytkownik podaje na początku dwie liczby: początekZakresu oraz koniecZakresu.
        //    Upewnij się że początekZakresu < koniecZakresu a następnie pobierz od użytkownika kolejną liczbę - dzielnik.
        //    Po pobraniu dzielnika wypisz wszystkie liczby od początekZakresu do koniecZakresu które są podzielne przez
        //    dzielnik.


        System.out.println("Podaj początek zakresu");
        int początekZakresu = scanner.nextInt();

        System.out.println("Podaj koniec zakresu");
        int koniecZakresu = scanner.nextInt();

        if (początekZakresu > koniecZakresu) {
            System.out.println("Pętle nie wykona się, ponieważ początek zakresu jest większy od koniec zakresu");
        }

        System.out.println("Podaj dzielnik:");
        int dzielnik = scanner.nextInt();

        for (int i = początekZakresu; i < koniecZakresu; i++) {
            if (i % dzielnik == 0)
            System.out.println(i);
        }

    }
}
