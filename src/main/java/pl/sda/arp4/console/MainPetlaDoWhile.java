package pl.sda.arp4.console;

import java.util.Scanner;

public class MainPetlaDoWhile {
    public static void main(String[] args) {
        // są dwie pętle while:
        // - do while - coś musi się chociaż raz wykonać
        // - while do -

        Scanner scanner = new Scanner (System.in);

        // Pętla dekrementująca - malejąca

        System.out.println("Podaj liczbę:");
        int liczba = scanner.nextInt();

        do {
            System.out.println((liczba) +" Hello World!");
            liczba--;

        } while (liczba > 0);

        // Pętla inkrementująca - rosnąca

        System.out.println("Podaj liczbę:");
        int liczba2 = scanner.nextInt();
        int i = 0;

        do {
            System.out.println((i+1) +" Hello World!");
            i++;

        } while (i < liczba2);
        }
    }