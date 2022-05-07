package pl.sda.arp4.console;

import java.util.Scanner;

public class MainZadaniePetlaDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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