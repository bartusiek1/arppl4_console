package pl.sda.arp4.console;

import java.util.Scanner;

public class MainPetlaDoWhile {
    public static void main(String[] args) {
        // są dwie pętle while:
        // - do while - coś musi się chociaż raz wykonać
        // - while do -


        Scanner scanner = new Scanner (System.in);
        System.out.println("podaj liczbę:");
        int liczba = scanner.nextInt();

        do {
            System.out.println((liczba) +" Hello World!");
            liczba--;

        } while (liczba > 0);

        System.out.println("podaj liczbę:");
        int liczba2 = scanner.nextInt();

        do {
            System.out.println((liczba2) +" Hello World!");
            liczba2++;

        } while (liczba2 < 10);
        }
    }